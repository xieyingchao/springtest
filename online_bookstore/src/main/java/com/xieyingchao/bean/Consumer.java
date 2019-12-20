package com.xieyingchao.bean;

/**
 * @Description TODO
 * @Author 谢迎超
 * @Date 2019/11/30 15:30
 */
public class Consumer {

    String cid;
    String cname;
    String phone;
    String address;

    public Consumer(String cid, String cname, String phone, String address) {
        this.cid = cid;
        this.cname = cname;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
