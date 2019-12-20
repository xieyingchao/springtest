package com.xieyingchao.mapper;

import com.xieyingchao.bean.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description TODO
 * @Author 谢迎超
 * @Date 2019/12/2 21:28
 */

@Mapper
public interface ShoppingMapper {

    @Select("select * from book where bid in (select bid from shoppingcart where cid = #{cid})")
    List<Book> getAllBookInCart(String cid);

    @Insert("insert into shoppingcart(cid,bid) values(#{cid},#{bid})")
    int insertBookToCart(String cid,String bid);

    @Delete("delete from shoppingcart where cid=#{cid} and bid=#{bid}")
    int deleteBookInCart(String cid,String bid);
}
