package com.muhammedtopgul.javamasterclass.collections.abc;

/**
 * @author muhammed-topgul
 * @created at 14.12.2021 22:47
 */

public class Name {

    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                '}';
    }
}
