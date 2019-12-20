package com.xieyingchao.bean;

/**
 * @Description TODO
 * @Author 谢迎超
 * @Date 2019/11/16 20:50
 */
public class Book {

    private String bid;
    private String bname;
    private float price;
    private String author;
    private String press;

    public Book(String bid, String bname, float price, String author, String press) {
        this.bid = bid;
        this.bname = bname;
        this.price = price;
        this.author = author;
        this.press = press;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid='" + bid + '\'' +
                ", bname='" + bname + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", press='" + press + '\'' +
                '}';
    }
}
