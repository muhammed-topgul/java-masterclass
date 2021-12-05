package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.upcasting;

/**
 * @author muhammed-topgul 
 * @created at 24.11.2021 11:37
 */

public class Director extends Manager {

    private final double DIRECTOR_BONUS_RATE = 1.2;

    public Director() {
    }

    public Director(int no, String name, int year, String department, String departmentManagement) {
        super(no, name, year, department, departmentManagement);
    }

    public void makeAStrategicPlan() {
        System.out.println("Director making a strategic plan...");
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
        return super.calculateSalary() * DIRECTOR_BONUS_RATE;
    }

    @Override
    public void printInfo() {
        System.out.println("Director, no: " + super.getNo() + ", name: " + super.getName() +
                ", year: " + super.getYear() + ", department:  " + super.getDepartment() + ", departmentManagement: " + super.getDepartmentManagement() + "\n");
    }
}
