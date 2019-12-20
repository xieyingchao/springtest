package com.xieyingchao.service;

import com.xieyingchao.bean.Consumer;
import com.xieyingchao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.List;

/**
 * @Description TODO
 * @Author 谢迎超
 * @Date 2019/11/30 19:04
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<Consumer> getAllUser(){
        System.out.println(userMapper.getAllUser());
        return userMapper.getAllUser();
    }

    public boolean deleteUserById(String cid){
        int flag = userMapper.deleteUserById(cid);
        if(1 == flag) return true;
        else return false;
    }
}
