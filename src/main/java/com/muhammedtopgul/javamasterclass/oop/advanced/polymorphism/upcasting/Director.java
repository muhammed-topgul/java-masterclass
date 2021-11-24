package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.upcasting;

/**
 * @author muhammed-topgul created at 24/11/2021 11:37
 */

public class Director extends Manager {

    public Director(int no, String name, int year, String department, String departmentManagement) {
        super(no, name, year, department, departmentManagement);
    }

    @Override
    public void work() {
        System.out.println("Director is working...");
    }

    @Override
    public void manage() {
        System.out.println("Director is managing...");
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() * 1.2;
    }

    @Override
    public void printInfo() {
        System.out.println("Director, no: " + super.getNo() + ", name: " + super.getName() +
                ", year: " + super.getYear() + ", department:  " + super.getDepartment() + ", departmentManagement: " + super.getDepartmentManagement() + "\n");
    }
}
