package com.muhammedtopgul.javamasterclass.oop.basic._override;

/**
 * @author muhammed-topgul 
 * @since 18.11.2021 13:38
 */

public class Employee {

    private static final int EMPLOYEE_SALARY = 2000;

    private String id;
    private String name;
    private String department;
    private int year;

    public Employee(String id, String name, String department, int year) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.year = year;
    }

    public void salary() {
        System.out.println("Employee Salary: " + year * EMPLOYEE_SALARY);
    }

    public void work() {
        System.out.println(name + " is working...");
    }

    public Employee getPerson() {
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
