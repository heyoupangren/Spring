package com.org.cwh.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Cwh
 * CreateTime 2019/7/12 13:53
 */
public class Main {
    public static  void  main(String[] args){
        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("bean-cycle.xml");

        Car car =(Car)cxt.getBean("car");
        System.out.println(car);
        cxt.close();
    }
}
