package com.org.cwh.spring;

/**
 * @author Cwh
 * CreateTime 2019/7/12 11:00
 */
public class Pet {
    private String status;
    private String name;
    private int age;

    public Pet(String status, String name, int age) {
        this.status = status;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "status='" + status + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
