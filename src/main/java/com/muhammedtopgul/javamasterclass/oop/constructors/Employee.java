package com.muhammedtopgul.javamasterclass.oop.constructors;

/**
 * @author muhammed-topgul created at 18/11/2021 09:24
 */

public class Employee {

    public static String CLASS_NAME = "Employee.java";
    public static String specialty;

    static {
        System.out.println("In Employee static {}");
    }

    {
        System.out.println("In Employee {}");
    }

    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
        System.out.println("In Employee");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
