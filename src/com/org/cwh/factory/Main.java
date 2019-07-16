package com.org.cwh.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Cwh
 * CreateTime 2019/7/12 17:07
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext cxt= new ClassPathXmlApplicationContext("beans-factory.xml");

        Car car1 = (Car)cxt.getBean("car1");

        System.out.println(car1);

        Car car2 = (Car)cxt.getBean("car2");

        System.out.println(car2);


        Car car = (Car)cxt.getBean("car");

        System.out.println(car);
    }
}
