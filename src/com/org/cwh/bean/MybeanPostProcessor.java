package com.org.cwh.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Cwh
 * CreateTime 2019/7/12 13:56
 */
public class MybeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessBeforeInitialization"+ o +","+s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessAfterInitialization"+ o +","+s);
        Car car =new Car();
        car.setName("Audi");
        return car;
    }
}
