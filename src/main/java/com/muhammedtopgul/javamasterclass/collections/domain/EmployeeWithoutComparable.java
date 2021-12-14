package com.muhammedtopgul.javamasterclass.collections.domain;

/**
 * @author muhammed-topgul
 * @created at 13.12.2021 23:19
 */

public class EmployeeWithoutComparable extends Person implements Worker {
    protected int no;
    protected int year;

    public EmployeeWithoutComparable(int no, String firstName, String lastName) {
        super(firstName, lastName);
        this.no = no;
    }

    public EmployeeWithoutComparable(int no, String firstName, String lastName, int year) {
        super(firstName, lastName);
        this.no = no;
        this.year = year;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Employee [no=" + no + ", year=" + year + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    @Override
    public void work() {
        System.out.println("Employee is working!");

    }

    @Override
    public double calculateSalary() {
        return year * BASE_SALARY;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode() on Employee with no: " + no);
        return no;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals() on Employee with no: " + no);
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EmployeeWithoutComparable other = (EmployeeWithoutComparable) obj;
        System.out.println("equals() on Employee with no: " + this + " other Employee with no: " + obj);
        if (no != other.no)
            return false;
        return true;
    }
}
