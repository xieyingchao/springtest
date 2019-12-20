package com.xyc.ui;

import com.xyc.dao.IloginDao;
import com.xyc.factory.MybeanFactory;
import com.xyc.service.IloginService;
import com.xyc.service.IloginServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class client {

    public static void main(String[] args) throws Exception {
        //获取核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        //根据id获取bean对象
        IloginDao ld = (IloginDao) ac.getBean("IloginDao");
        IloginService ls = (IloginService) ac.getBean("IloginService");
        //IloginDao ld2 = (IloginDao) ac.getBean("IloginDao");

//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        IloginDao ild = (IloginDao)beanFactory.getBean("IloginDao");
//        System.out.println(ild);
//        ild.test();

//        IloginDao ils = MybeanFactory.CreateDao();
//        ils.test();
//        IloginDao ild = ac.getBean("ilogindao",IloginDao.class);
//        ild.test();

        System.out.println(ld);
        //ld.getClass().getMethod("getStr").invoke(ld.getClass().newInstance());
        //System.out.println(ld2);
        ld.test();
        //System.out.println(ls);
        ls.test();

    }
}
