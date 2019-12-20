package com.xieyingchao.web;

import com.xieyingchao.service.bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author 谢迎超
 * @Date 2019/11/30 10:00
 */

@Component
public class bookweb {

    @Autowired
    bookservice bookservice;

    public void printout() {
        System.out.println("----I am BookWeb!----");
        bookservice.printout();
    }
}
