package com.xieyingchao.mapper;

import com.xieyingchao.bean.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Description TODO
 * @Author 谢迎超
 * @Date 2019/11/16 13:59
 */

@Mapper
public interface BookMapper {

    @Select("select * from book where bid = #{bid}")
    public Book getBookbyId(String bid);
}
