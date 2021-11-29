package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces;

import java.util.Arrays;

/**
 * @author muhammed-topgul created at 29/11/2021 10:29
 */

public class ComparableTest {

    public static void main(String[] args) {
        HumanResources humanResources = new HumanResources();

        Worker[] workers = new Worker[10];

        for (int i = 0; i < 10; i++) {
            workers[i] = humanResources.getAnWorker();
        }

        for (Worker worker : workers) {
            Employee employee = (Employee) worker;
            System.out.println(employee);
        }

        Arrays.sort(workers);

        System.out.println("\n ************ AFTER SORT ************ \n");
        for (Worker worker : workers) {
            Employee employee = (Employee) worker;
            System.out.println(employee);
        }
    }
}
