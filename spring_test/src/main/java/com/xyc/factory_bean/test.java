package com.xyc.factory_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String[] args) {

        String xmlPath = "bean.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService) ac.getBean("userservice");
        userService.adduser();
        userService.deleteuser();
        userService.updateuser();
    }
}
