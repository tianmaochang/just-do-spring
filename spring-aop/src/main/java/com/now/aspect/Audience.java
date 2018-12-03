package com.now.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    /**
     * 1、使用不同的方法来实现前、后置通知
     */

    @Pointcut("execution(**com.now.inter.Performance.proform(..))")
    public void performance(){}

    @Before("performance()")  //表演之前
    public void silenceCellPhones() {
        System.out.println("Silencing cell phone");
    }

    @Before("performance()")  //表演之前
    public void takesSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")  //表演之后
    public void applause() {
        System.out.println("CLAP CLAP CLAP");
    }

    @AfterThrowing("performance()")  //表演失败之后
    public void demandRefund() {
        System.out.println("Demanding s Refund");
    }

    /**
     * 2、使用环绕通知来实现前、后置通知
     */
//    @Around("performance()")
//    public void watchPerformance(ProceedingJoinPoint joinPoint){
//        try {
//            System.out.println("Silencing cell phone");
//            System.out.println("Taking seats");
//            joinPoint.proceed();
//            System.out.println("CLAP CLAP CLAP");
//        } catch (Throwable throwable) {
//            System.out.println("Demanding s Refund");
//        }
//    }

}
