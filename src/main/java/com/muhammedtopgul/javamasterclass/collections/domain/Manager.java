package com.muhammedtopgul.javamasterclass.collections.domain;

/**
 * @author muhammed-topgul
 * @created at 13.12.2021 23:21
 */

public class Manager extends Employee {
    String department;

    public Manager(int no, String firstName, String lastName, int year, String department) {
        super(no, firstName, lastName, year);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}