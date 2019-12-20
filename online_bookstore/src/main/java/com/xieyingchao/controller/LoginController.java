package com.xieyingchao.controller;
import java.util.HashMap;
import java.util.List;
import	java.util.Map;

import com.xieyingchao.bean.Book;
import com.xieyingchao.service.BookService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Description TODO
 * @Author 谢迎超
 * @Date 2019/12/1 22:58
 */
@Controller
public class LoginController {

    @Autowired
    BookService bookService;

    @PostMapping("/userLogin")
    public String login(@RequestParam String username, @RequestParam String password, HttpSession session, HttpServletResponse response) {
//        String username = map.get("username");
//        String password = map.get("password");
        session.setAttribute("username",username);
        System.out.println(username+":"+password);
        Cookie cookie = new Cookie("username", username);
        cookie.setMaxAge(60);
        response.addCookie(cookie);
        if(username.equals("root") && password.equals("admin")){
            return "index";
        }else if (username.equals("002") && password.equals("123456")){
            return "userindex";
        }else{
            return "login";
        }
    }
}
