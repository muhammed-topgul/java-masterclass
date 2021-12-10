package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.multipleInheritance;

/**
 * @author muhammed-topgul 
 * @since 29.11.2021 16:42
 */

public class Main {

    public static void main(String[] args) {
        InterfaceA interfaceA = new ClassA();
        System.out.println(interfaceA.getName());

        InterfaceB interfaceB = new ClassA();
        System.out.println(interfaceB.getName());

        ClassA classA = new ClassA();
        System.out.println(classA.getName());
    }
}
