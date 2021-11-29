package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces;

/**
 * @author muhammed-topgul created at 28/11/2021 18:10
 */

public class HumanResources {

    public Worker getAnWorker() {
        Worker worker;
        int i = (int) (Math.random() * 4);

        if (i == 0) {
            worker = new Employee();
        } else if (i == 1) {
            worker = new Secretary();
        } else if (i == 2) {
            worker = new Engineer();
        } else if (i == 3) {
            worker = new Manager();
        } else if (i == 4) {
            worker = new Director();
        } else if (i == 5) {
            worker = new Boss();
        } else {
            throw new RuntimeException("No such object exception");
        }

        return worker;
    }
}
