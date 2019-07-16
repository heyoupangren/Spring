package com.org.cwh.spring;

import java.util.List;

/**
 * @author Cwh
 * CreateTime 2019/7/12 10:51
 */
public class Person {

    private String name;
    private int age;
    private Car car;
    private double pai;
    private String info;
    private List<Pet> pet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Pet> getPet() {
        return pet;
    }

    public void setPet(List<Pet> pet) {
        this.pet = pet;
    }

    public double getPai() {
        return pai;
    }

    public void setPai(double pai) {
        this.pai = pai;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                ", pai=" + pai +
                ", info='" + info + '\'' +
                ", pet=" + pet +
                '}';
    }

    public Person(){
        System.out.println("person's create.....");
    }
}
