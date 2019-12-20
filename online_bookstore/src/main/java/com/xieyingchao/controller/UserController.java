package com.xieyingchao.controller;

import com.xieyingchao.bean.Consumer;
import com.xieyingchao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description TODO
 * @Author 谢迎超
 * @Date 2019/11/30 19:07
 */

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAllUser")
    public List<Consumer> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/deleteUserById")
    public boolean deleteUserById(@RequestParam String cid){
        return userService.deleteUserById(cid);
    }

}
