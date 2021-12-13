package com.muhammedtopgul.javamasterclass.collections.domain;

/**
 * @author muhammed-topgul
 * @created at 13.12.2021 23:22
 */

public class Student implements Comparable {
    private int id;
    private String fullName;

    public Student(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String toString() {
        return id + " " + fullName;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        if(id < s.id)
            return -1;
        else if(id == s.id)
            return 0;
        else
            return 1;
    }
}