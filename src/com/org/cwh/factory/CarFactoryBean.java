package com.org.cwh.factory;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author Cwh
 * CreateTime 2019/7/12 17:42
 */
public class CarFactoryBean implements FactoryBean<Car> {

 /*   private String name;

    public void setName(String name){
        this.name=name;
    }*/

    //返回bean对象
    @Override
    public Car getObject() throws Exception {
        return new Car("BMWsss",500000);
    }

    /**
     *
     * 返回bean类型
     *
     */
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
