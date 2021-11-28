package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.abstractClasses;

/**
 * @author muhammed-topgul created at 28/11/2021 15:28
 */

public class Main {

    public static void main(String[] args) {
        HumanResources humanResources = new HumanResources();
        Employee employee = humanResources.getAnEmployee();

        employee.speakAbstract();
        employee.speakConcrete();
    }
}
