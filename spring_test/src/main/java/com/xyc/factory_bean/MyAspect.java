package com.xyc.factory_bean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//public class MyAspect implements MethodInterceptor {
//    @Override
//    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
//
//        System.out.println("前");
//
//        Object obj = methodInvocation.proceed();
//
//        System.out.println("后");
//
//        return obj;
//    }
//}

@Component
@Aspect
public class MyAspect{

    @Pointcut("execution(* com.xyc.factory_bean.*.*(..))")
    public void MyPointCut(){}

//    @Before("MyPointCut()")
    public void MyBefore(JoinPoint joinPoint){
        System.out.println("前置通知:" + joinPoint.getSignature().toString());
    }

//    @AfterReturning(value = "MyPointCut()" ,returning = "ret")
    public void MyAfterReturning(JoinPoint joinPoint,Object ret){
        System.out.println("后置通知：" + joinPoint.getSignature().toString() + "-->" + ret);
    }

    @Around(value = "MyPointCut()")
    public Object MyAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕通知前");

        Object obj = proceedingJoinPoint.proceed();

        System.out.println("环绕通知后");

        return obj;
    }

//    @AfterThrowing(value = "MyPointCut()" ,throwing = "throwable")
    public void MyAfterThrowing(JoinPoint joinPoint,Throwable throwable){

        System.out.println("抛出异常通知：" + joinPoint.getSignature().toString() + "--->" + throwable.getMessage());
    }

//    @After("MyPointCut()")
    public void MyAfter(JoinPoint joinPoint){

        System.out.println("最终通知");
    }
}