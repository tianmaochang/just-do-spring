package com.now;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HumanTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HumanService service = (HumanService) context.getBean("humanService");
        Human human = service.getHuman();
        human.say();
    }
}
