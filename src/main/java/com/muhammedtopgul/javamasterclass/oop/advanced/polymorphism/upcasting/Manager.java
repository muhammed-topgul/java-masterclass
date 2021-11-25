package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.upcasting;

/**
 * @author muhammed-topgul created at 24/11/2021 11:28
 */

public class Manager extends Employee {

    public static final int MANAGEMENT_PAYMENT = 5000;

    private String departmentManagement;

    public Manager() {
    }

    public Manager(int no, String name, int year, String department, String departmentManagement) {
        super(no, name, year, department);
        this.departmentManagement = departmentManagement;
    }

    @Override
    public void work() {
        System.out.println("Manager is working...");
    }

    public void manage() {
        System.out.println("Manager is managing...");
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + MANAGEMENT_PAYMENT;
    }

    @Override
    public void printInfo() {
        System.out.println("Manager, no: " + super.getNo() + ", name: " + super.getName() +
                ", year: " + super.getYear() + ", department:  " + super.getDepartment() + ", departmentManagement: " + departmentManagement + "\n");
    }

    //
    public String getDepartmentManagement() {
        return departmentManagement;
    }

    public void setDepartmentManagement(String departmentManagement) {
        this.departmentManagement = departmentManagement;
    }
}
