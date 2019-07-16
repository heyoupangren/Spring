package com.org.cwh.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Cwh
 * CreateTime 2019/7/13 11:56
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext cxt= new ClassPathXmlApplicationContext("beans-generic-di.xml");

        UserService userService =(UserService)cxt.getBean("userService");

        userService.add();
    }
}
