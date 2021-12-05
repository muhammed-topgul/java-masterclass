package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.abstractClasses;

/**
 * @author muhammed-topgul 
 * @created at 28.11.2021 13:58
 */

public abstract class Employee extends Person {

    public static final int BASE_SALARY = 2000;

    protected int no;
    protected String name;
    protected int year;
    protected String department;

    public Employee() {
    }

    public Employee(int no, String name, int year) {
        this(no, name, year, null);
    }

    public Employee(int no, String name, int year, String department) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.department = department;
    }

    public abstract void work();

    public double calculateSalary() {
        return year * BASE_SALARY;
    }

    public void printInfo() {
        System.out.println("\nNo: " + no);
        System.out.println("Name:" + name);
        System.out.println("Year: " + year);
        System.out.println("Department: " + department);
    }

    @Override
    public void speakAbstract() {
        System.out.println("Employee is speaking...");
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

    @Override
    public String toString() {
        return "Employee{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", department='" + department + '\'' +
                '}';
    }
}
