package com.xyc.service;

import com.xyc.dao.IloginDao;

public class IloginServiceImpl implements IloginService {
    @Override
    public void test() {
        System.out.println("service_test");
        this.ilogindao.test();
    }
    private IloginDao ilogindao;

    public void setIlogindao(IloginDao ilogindao) {
        this.ilogindao = ilogindao;
    }

    public void init(){
        System.out.println("初始化");
    }
    public void destroy(){
        System.out.println("销毁");
    }
}
