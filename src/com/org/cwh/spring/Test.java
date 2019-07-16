package com.org.cwh.spring;


import com.mchange.v2.c3p0.DataSources;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Cwh
 * CreateTime 2019/7/12 10:42
 */
public class Test {
    public static void main(String[] args){

        ApplicationContext axt = new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car = (Car) axt.getBean("car");

        System.out.println(car);

        Person person =(Person) axt.getBean("persons");

        System.out.println(person);

        DataSources dataSources =(DataSources) axt.getBean("dataSource");

        System.out.println(dataSources);

    }
}
