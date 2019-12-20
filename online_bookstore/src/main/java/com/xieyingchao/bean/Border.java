package com.xieyingchao.bean;

import java.util.Date;

/**
 * @Description TODO
 * @Author 谢迎超
 * @Date 2019/11/30 15:29
 */
public class Border {
    int oid;
    String cid;
    Date otime;
    String ostate;
    String receptor;
    String address;
    String phone;
    String bid;
    int quantity;

    public Border(int oid, String cid, Date otime, String ostate, String receptor, String address, String phone) {
        this.oid = oid;
        this.cid = cid;
        this.otime = otime;
        this.ostate = ostate;
        this.receptor = receptor;
        this.address = address;
        this.phone = phone;
    }

    public Border(int oid, String cid, Date otime, String ostate, String receptor, String address, String phone, String bid, int quantity) {
        this.oid = oid;
        this.cid = cid;
        this.otime = otime;
        this.ostate = ostate;
        this.receptor = receptor;
        this.address = address;
        this.phone = phone;
        this.bid = bid;
        this.quantity = quantity;
    }

    public Border(int oid, String cid, Date otime, String receptor, String address, String phone) {
        this.oid = oid;
        this.cid = cid;
        this.otime = otime;
        this.receptor = receptor;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Border{" +
                "oid=" + oid +
                ", cid='" + cid + '\'' +
                ", otime=" + otime +
                ", ostate='" + ostate + '\'' +
                ", receptor='" + receptor + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public Date getOtime() {
        return otime;
    }

    public void setOtime(Date otime) {
        this.otime = otime;
    }

    public String getOstate() {
        return ostate;
    }

    public void setOstate(String ostate) {
        this.ostate = ostate;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
