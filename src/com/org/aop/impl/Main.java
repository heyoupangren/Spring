package com.org.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Cwh
 * CreateTime 2019/7/13 13:17
 */
public class Main {
    public static void main(String[] args) {
        //1.创建Spring IOC 容器
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext-aop.xml");
        //2.从IOC容器中获取bean的实例
        AtithmeticCalculator atithmeticCalculator = (AtithmeticCalculator)cxt.getBean("atithmeticCalculator");
        //3.使用bean
        int result = atithmeticCalculator.add(3,5);
        System.out.println("result:"+ result);

         result = atithmeticCalculator.div(10,2);
        System.out.println("result:"+ result);
    }
}
