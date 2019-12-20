package com.xyc.domain;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author 谢迎超
 * @Date 2019/8/1 16:34
 */
public class Account implements Serializable {
    private String username;
    private String password;
    private double money;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                '}';
    }
}
