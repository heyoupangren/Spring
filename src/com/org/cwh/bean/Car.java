package com.org.cwh.bean;

/**
 * @author Cwh
 * CreateTime 2019/7/12 13:48
 */
public class Car {
    private String name;


    public void setName(String name) {
        System.out.println("setName.....");
        this.name = name;
    }

    public Car(){
        System.out.println("car's constructor....");
    }
    public void init(){
        System.out.println("init...");
    }
    public void destroy(){
        System.out.println("destroy....");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
