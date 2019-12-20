package com.xieyingchao.service;
import	java.security.KeyStore.Builder;

import com.xieyingchao.dao.bookdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author 谢迎超
 * @Date 2019/11/30 9:57
 */

@Component
public class bookservice {

    @Autowired
    bookdao bookdao;

    public void printout(){
        System.out.println("------I am BookService!------");
        bookdao.printout();
    }
}
