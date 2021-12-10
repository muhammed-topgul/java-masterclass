package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.office;

/**
 * @author muhammed-topgul
 * @since 28.11.2021 18:08
 */

public class Manager extends Employee {

    public static final int MANAGEMENT_PAYMENT = 5000;

    protected String departmentManaged;

    public Manager() {
    }

    public Manager(int no, String name, int year, String workingDepartment, String departmentManaged) {
        super(no, name, year, workingDepartment);
        this.departmentManaged = departmentManaged;
    }

    public Manager(int no, String name, int year, String departmentManaged) {
        super(no, name, year);
        this.departmentManaged = departmentManaged;
    }

    @Override
    public void work() {
        System.out.println("Manager is working!");
        manage();
    }

    public void manage() {
        System.out.println("Manager manages department: " + departmentManaged);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + MANAGEMENT_PAYMENT;
    }

    @Override
    public void printInfo() {
        System.out.println("\nManager Info");
        super.printInfo();
        System.out.println("Managing Department: " + departmentManaged);
    }
}
