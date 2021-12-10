package com.muhammedtopgul.javamasterclass.functionalProgramming.builtInInterfaces.reference;

import java.util.Date;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * @author muhammed-topgul
 * @since 10.12.2021 17:09
 */

public class MethodReference {

    public static void main(String[] args) {
        Consumer<String> printer1 = (var) -> System.out.println(var);
        Consumer<String> printer2 = System.out::println;

        printer1.accept("Muhammed");
        printer2.accept("Muhammed");


        Book bookRef = new Book();
        Consumer<Book> book1 = (var) -> var.printInfo();
        book1.accept(bookRef);

        Consumer<Book> book2 = Book::printInfo;
        book2.accept(bookRef);

        Consumer<String> string1 = (var) -> bookRef.setName(var);
        Consumer<String> string2 = bookRef::setName;
        string1.accept("Java SE");
        string2.accept("Java SE");

        UnaryOperator<String> greeting1 = (var) -> "Hello, ".concat(var);
        UnaryOperator<String> greeting2 = "Hello, "::concat;
        System.out.println(greeting1.apply("Muhammed"));
        System.out.println(greeting2.apply("World"));

        BinaryOperator<String> greeting3 = (var1, var2) -> var1.concat(var2);
        BinaryOperator<String> greeting4 = String::concat;
        System.out.println(greeting3.apply("Java", "11"));
        System.out.println(greeting4.apply("Spring", "5"));

        Supplier<Date> date1 = () -> new Date();
        Supplier<Date> date2 = Date::new;
        System.out.println(date1.get());
        System.out.println(date2.get());
    }
}

class Book {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Book.class");
    }
}
