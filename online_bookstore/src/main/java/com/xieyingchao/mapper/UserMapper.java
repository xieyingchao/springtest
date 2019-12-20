package com.xieyingchao.mapper;
import	java.nio.channels.SelectionKey;
import java.util.List;

import com.xieyingchao.bean.Consumer;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Description TODO
 * @Author 谢迎超
 * @Date 2019/11/30 15:27
 */
@Mapper
public interface UserMapper {

    @Select("select * from customer")
    public List<Consumer> getAllUser();

    @Delete("delete from customer where cid = #{cid}")
    public int deleteUserById(String cid);
}
