package com.muhammedtopgul.javamasterclass.collections.domain;

/**
 * @author muhammed-topgul
 * @created at 13.12.2021 23:18
 */

public class Person {

    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}
