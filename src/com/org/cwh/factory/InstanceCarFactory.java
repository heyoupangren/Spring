package com.org.cwh.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cwh
 * CreateTime 2019/7/12 17:23
 * 实例工厂方法：实例工厂的方法，即现需要创建工厂本身，再调用工厂的实例方法来返回bean实例
 */
public class InstanceCarFactory {

    private Map<String ,Car>cars =null;

    public InstanceCarFactory(){
        cars = new HashMap<String, Car>();
        cars.put("audi",new Car("audi",300000));
        cars.put("ford",new Car("ford",200000));
    }

    public  Car getcar(String name){
        return cars.get(name);
    }
}
