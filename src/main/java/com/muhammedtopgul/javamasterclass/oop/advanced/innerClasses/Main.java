package com.muhammedtopgul.javamasterclass.oop.advanced.innerClasses;

/**
 * @author muhammed-topgul created at 30/11/2021 10:19
 */

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        // main.createWithTopClass();
        // main.createFromTopClass();
        // main.localClassTest();
        // main.staticLocalClassTest();
        main.anonymousInnerClassTest();
    }

    public void createWithTopClass() {
        // OuterClass.InnerClass innerClass = new OuterClass("s","s").new InnerClass("s","b");
        OuterClass outerClass = new OuterClass("A", "B", "C");
        OuterClass.InnerClass innerClass = outerClass.new InnerClass("D", "E");

        System.out.println(outerClass);
        System.out.println(innerClass);

        System.out.println("****************************");

        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass("F", "G");
        System.out.println(nestedClass);
    }

    public void createFromTopClass() {
        OuterClass outerClass = new OuterClass("A", "B", "C");

        OuterClass.InnerClass innerClass = outerClass.createInnerClass("D", "E");
        System.out.println(innerClass.toString());

        OuterClass.NestedClass nestedClass = outerClass.createNestedClass("F", "G");
        System.out.println(nestedClass.toString());
    }

    public void localClassTest() {
        OuterClass outerClass = new OuterClass("A", "B", "C");
        outerClass.localClass();
    }

    public void staticLocalClassTest() {
        OuterClass.staticLocalClass();
    }

    public void anonymousInnerClassTest() {
        OuterClass outerClass = new OuterClass("A", "B", "C");
        outerClass.anonymousInnerClass();
    }
}
