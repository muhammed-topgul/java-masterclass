package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.binding;

/**
 * @author muhammed-topgul 
 * @since 25.11.2021 16:53
 *
 * <p>
 * private, static and final methods cannot be overrided.
 * variables cannot be overrided so, variables are type of early binding.
 * <p>
 * Late Binding: Polymorphic methods are late binding type. Because JVM decide which method run in runtime.
 * Early Binding: private, static and final methods are early binding type. Because JVM decide which method run in compile time.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Methods...");
        Parent parent1 = new Child1();
        parent1.staticMethod();
        parent1.publicMethod();
        parent1.protectedMethod();
        parent1.finalMethod();

        System.out.println("\n");

        Child1 child1 = new Child1();
        child1.staticMethod();
        child1.publicMethod();
        child1.protectedMethod();
        child1.finalMethod();

        System.out.println("\nVariables...");
        System.out.println(parent1.a);
        System.out.println(parent1.b);

        System.out.println("\n");

        System.out.println(child1.a);
        System.out.println(child1.b);
    }
}
