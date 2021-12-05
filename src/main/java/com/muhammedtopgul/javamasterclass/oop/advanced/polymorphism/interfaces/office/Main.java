package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.office;

/**
 * @author muhammed-topgul 
 * @created at 28.11.2021 18:11
 */

public class Main {

    public static void main(String[] args) {
        HumanResources humanResources = new HumanResources();
        Worker worker = humanResources.getAnWorker();

        worker.work();

        if (worker instanceof Boss) {
            System.out.println("Worker is a Boss.class");
        } else if (worker instanceof Director) {
            System.out.println("Worker is a Director.class");
        } else if (worker instanceof Manager) {
            System.out.println("Worker is a Manager.class");
        } else if (worker instanceof Secretary) {
            System.out.println("Worker is a Secretary.class");
        } else if (worker instanceof Engineer) {
            System.out.println("Worker is an Engineer.class");
        } else {
            System.out.println("Worker is an Employee.class");
        }
    }
}
