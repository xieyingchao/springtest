package com.xieyingchao.mapper;
import	java.util.List;

import com.xieyingchao.bean.Border;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @Description TODO
 * @Author 谢迎超
 * @Date 2019/11/30 15:27
 */

@Mapper
public interface BorderMapper {

    @Select("select * from border")
    List<Border> getAllBorder();

    @Delete("delete from border where oid = #{id}")
    int deleteBorderById(int id);

    @Update("update border set ostate = #{state} where oid = #{oid}")
    int updataBorderState(int oid,String state);

    @Select("select * from border,borderitem where border.oid = borderitem.oid")
    List<Border> getAllBorderItem();
}
