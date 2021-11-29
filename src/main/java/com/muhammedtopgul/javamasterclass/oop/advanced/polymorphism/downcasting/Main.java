package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.downcasting;

/**
 * @author muhammed-topgul created at 26/11/2021 09:43
 */

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        HumanResources humanResources = new HumanResources();

        Employee employee = humanResources.getAnEmployee();

        // first solution
        main.instanceOfSolution(employee);

        System.out.println("\n");

        // second solution
        main.getClassSolution(employee);
    }

    public void instanceOfSolution(Employee employee) {
        if (employee instanceof Director) {
            directorOperation(employee);
        } else if (employee instanceof Manager) {
            managerOperation(employee);
        } else {
            employeeOperation(employee);
        }
    }

    public void getClassSolution(Employee employee) {
        if (employee.getClass().equals(Director.class)) {
            directorOperation(employee);
        } else if (employee.getClass().equals(Manager.class)) {
            managerOperation(employee);
        } else {
            employeeOperation(employee);
        }
        System.out.println("\nFully Qualified Class Name: " + employee.getClass().getName());
    }

    public void directorOperation(Employee employee) {
        System.out.println("A director chosen...");
        Director director = (Director) employee;
        director.makeAStrategicPlan();
    }

    public void managerOperation(Employee employee) {
        System.out.println("A manager chosen...");
        Manager manager = (Manager) employee;
        manager.manage();
    }

    public void employeeOperation(Employee employee) {
        System.out.println("An employee chosen...");
        employee.work();
    }
}
