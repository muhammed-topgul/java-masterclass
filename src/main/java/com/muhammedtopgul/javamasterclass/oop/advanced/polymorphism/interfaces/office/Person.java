package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.interfaces.office;

/**
 * @author muhammed-topgul created at 29/11/2021 10:24
 */

public abstract class Person implements Worker, Comparable<Person> {

    protected int no;
    protected String name;

    public Person() {
    }

    public Person(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        // return Integer.compare(this.no, o.no);
        return this.name.compareTo(o.name);
    }
}
