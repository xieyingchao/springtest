package com.xieyingchao.mapper;
import	java.util.List;

import com.xieyingchao.bean.Book;
import org.apache.ibatis.annotations.*;

/**
 * @Description TODO
 * @Author 谢迎超
 * @Date 2019/11/16 20:52
 */

@Mapper
public interface BookMapper {

    @Select("select * from book")
    public List<Book> getAllBook();

    @Select("select * from book where bid = #{id}")
    public Book getBookbyId(String id);

    @Delete("delete from book where bid = #{id}")
    public int deleteBookById(String id);

    @Insert("insert into book values (#{bid},#{bname},#{price},#{author},#{press})")
    public int insertBook(Book book);

    @Update("update book set bname = #{bname}, price = #{price},author = #{author},press = #{press} where bid = #{bid}")
    public int updataBook(Book book);
}
