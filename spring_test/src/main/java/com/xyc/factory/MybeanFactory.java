package com.xyc.factory;

import com.xyc.dao.IloginDao;
import com.xyc.dao.IloginDaoImpl;
import com.xyc.service.IloginService;
import com.xyc.service.IloginServiceImpl;

public class MybeanFactory {

    public IloginDao CreateDao(){
        return new IloginDaoImpl();
    }
}
