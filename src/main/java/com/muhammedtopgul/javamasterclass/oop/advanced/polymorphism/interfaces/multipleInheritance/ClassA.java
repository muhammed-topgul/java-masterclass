package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.multipleInheritance;

import java.io.ObjectStreamConstants;

/**
 * @author muhammed-topgul 
 * @created at 29.11.2021 16:41
 */

public class ClassA implements InterfaceA, InterfaceB, ObjectStreamConstants {

    @Override
    public String getName() {
        return "ClassA.class";
    }

    @Override
    public int getAge() {
        return 10;
    }
}
