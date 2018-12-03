package com.now;

import com.now.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args) {
        /**
         * 1、使用xml配置文件来实现依赖注入
         */
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");

        /**
         * 2、使用javaConfig来实现依赖注入
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest("哈哈哈哈哈哈哈");
        context.close();
    }
}
