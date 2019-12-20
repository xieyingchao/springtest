package com.xyc.dao;

public class IloginDaoImpl implements IloginDao {

    private Integer num;
    private String str;
    private Integer num2;

    public IloginDaoImpl(){

    }
    public IloginDaoImpl(Integer num,String str){
        this.num = num;
        this.str = str;
    }
    public IloginDaoImpl(String str,Integer num2){
        this.str = str;
        this.num2 = num2;
    }

    public String getStr() {
        return str;
    }

    @Override
    public void test(){
        System.out.println("dao_test");
    }
    public void init(){
        System.out.println("初始化");
    }
    public void destroy(){
        System.out.println("销毁");
    }
}
