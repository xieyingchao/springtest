package com.xieyingchao.service;

import com.xieyingchao.bean.Border;
import com.xieyingchao.mapper.BorderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author 谢迎超
 * @Date 2019/11/30 15:53
 */

@Service
public class BorderService {

    @Autowired
    BorderMapper borderMapper;

    public List<Border> getAllBorder(){
        return borderMapper.getAllBorder();
    }

    public boolean deleteBorderById(String id){
        int id1 = Integer.parseInt(id);
        int flag = borderMapper.deleteBorderById(id1);
        if(flag == 1){
            return true;
        }else{
            return false;
        }
    }

    public boolean updateBorderState(String oid,String state){
        int id1 = Integer.parseInt(oid);
        System.out.println(id1+":"+state);
        int flag = borderMapper.updataBorderState(id1,state);
        if(flag == 1){
            return true;
        }else{
            return false;
        }
    }

    public List<Border> getAllBorderItem(){
        return borderMapper.getAllBorderItem();
    }
}
