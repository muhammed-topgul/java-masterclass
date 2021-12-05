package com.muhammedtopgul.javamasterclass.typesAndVariables;

/**
 * @author muhammed-topgul
 * @created at 27.10.2021 20:55
 */

public class Car {

    private String brand;
    private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }
}
