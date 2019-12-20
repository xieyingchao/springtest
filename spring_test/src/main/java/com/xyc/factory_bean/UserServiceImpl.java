package com.xyc.factory_bean;

import org.springframework.stereotype.Service;

@Service("userservice")
public class UserServiceImpl implements UserService {
    @Override
    public void adduser() {
        System.out.println("factory_bean adduser");
    }

    @Override
    public String  updateuser() {
        System.out.println("factory_bean updateuser");
        return "updateuser";
    }

    @Override
    public void deleteuser() {
        int i = 1/ 0;
        System.out.println("factory_bean deleteuser");
    }
}
