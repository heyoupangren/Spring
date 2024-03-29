package com.org.cwh.factory;

/**
 * @author Cwh
 * CreateTime 2019/7/12 16:53
 */

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 静态工厂方法：直接调用某个类的静态方法就可以返回bean实例
 */
public class StaticCarFactory {
    private static Map<String,Car> cars= new HashMap<String,Car>();

    static {
        cars.put("audi",new Car("audi",300000));
        cars.put("ford",new Car("ford",200000));

    }
    //静态工厂方法
    public static Car getCar(String name){
        return cars.get(name);
    }


}
