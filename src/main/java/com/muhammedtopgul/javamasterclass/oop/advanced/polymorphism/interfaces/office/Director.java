package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.office;

/**
 * @author muhammed-topgul created at 28/11/2021 18:08
 */

public class Director extends Manager {

    private final double DIRECTOR_BONUS_RATE = 1.2;

    public Director() {
    }

    public Director(int no, String name, int year, String workingDepartment, String managingDepartment) {
        super(no, name, year, workingDepartment, managingDepartment);
    }

    @Override
    public void work() {
        System.out.println("Director is working!");
        manage();
    }

    @Override
    public void manage() {
        System.out.println("Director manages whole company!");
        makeAStrategicPlan();
    }

    public void makeAStrategicPlan() {
        System.out.println("Director makes a strategic plan for the company!");
    }

    public double calculateSalary() {
        return super.calculateSalary() + DIRECTOR_BONUS_RATE;
    }

    public void printInfo() {
        System.out.println("\nDirector Info");
        super.printInfo();
    }

    @Override
    public String toString() {
        return "Director [bonus=" + DIRECTOR_BONUS_RATE + ", departmentManaged=" + departmentManaged + ", no=" + no + ", name="
                + name + ", year=" + year + ", department=" + department + "]";
    }
}
