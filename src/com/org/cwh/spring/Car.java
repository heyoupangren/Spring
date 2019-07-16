package com.org.cwh.spring;

/**
 * @author Cwh
 * CreateTime 2019/7/12 10:40
 */
public class Car {
    private String name;
    private String  manufacturer;
    private double price;
    private int shisu;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getShisu() {
        return shisu;
    }

    public void setShisu(int shisu) {
        this.shisu = shisu;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", shisu=" + shisu +
                '}';
    }
}
