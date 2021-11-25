package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.upcasting;

/**
 * @author muhammed-topgul created at 24/11/2021 11:24
 */

public class Employee {

    public static final int BASE_SALARY = 2000;

    private int no;
    private String name;
    private int year;
    private String department;

    public Employee() {
    }

    public Employee(int no, String name, int year, String department) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.department = department;
    }

    public void work() {
        System.out.println("Employee is working...");
    }

    public double calculateSalary() {
        return year * BASE_SALARY;
    }

    public void printInfo() {
        System.out.println("Employee, no: " + no + ", name: " + name + ", year: " + year + ", department:  " + department + "\n");
    }

    //
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
