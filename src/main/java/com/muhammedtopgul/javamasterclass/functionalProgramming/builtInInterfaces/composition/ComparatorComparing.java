package com.muhammedtopgul.javamasterclass.functionalProgramming.builtInInterfaces.composition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author muhammed-topgul
 * @since 10.12.2021 15:24
 */

public class ComparatorComparing {

    public static void main(String[] args) {
        List<Book> books = getBooks();

        printList(books);

        System.out.println("\nAfter Sort: ");
        Collections.sort(books);
        printList(books);

        System.out.println("\nAfter Sort By Author: ");
        Comparator<Book> compareByAuthor = (var1, var2) -> var1.getAuthor().compareTo(var2.getAuthor());
        Collections.sort(books, compareByAuthor);
        printList(books);

        System.out.println("\nAfter Sort By Page Count: ");
        Comparator<Book> compareByPageCount = (var1, var2) -> var1.getPageCount() - var2.getPageCount();
        Collections.sort(books, compareByPageCount);
        printList(books);

        books = getBooks();
        System.out.println("\nAfter Sort Author and Sort Page Count: ");
        Comparator<Book> compareByAuthorAndThanPageCount = compareByAuthor.thenComparing(compareByPageCount);
        Collections.sort(books, compareByAuthorAndThanPageCount);
        printList(books);

        System.out.println("\nAfter Reverse Sort Author and Reverse Sort Page Count: ");
        Collections.sort(books, compareByAuthorAndThanPageCount.reversed());
        printList(books);

    }

    private static void printList(List<Book> books) {
        books.forEach(book -> {
            System.out.println(book.toString());
        });
    }

    private static List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "How to Program Java", 1200, "Deitel & Deitel"));
        books.add(new Book(2, "How to Program Java", 1112, "Deitel & Deitel"));
        books.add(new Book(3, "How to Program Java", 1204, "Deitel & Deitel"));
        books.add(new Book(4, "Spring In Action", 620, "Craig Walls"));
        books.add(new Book(5, "Pro Spring 5", 861, "Chris Schaefer"));
        books.add(new Book(6, "Pro Spring 5", 868, "Chris Schaefer"));
        books.add(new Book(7, "Pro Spring 5", 860, "Chris Schaefer"));
        books.add(new Book(8, "Pro Spring 5", 867, "Chris Schaefer"));
        books.add(new Book(9, "Effective Java", 625, "Joshua Bloch"));
        books.add(new Book(10, "Effective Java", 622, "Joshua Bloch"));
        books.add(new Book(11, "Java 8 In Action", 757, "Alan Mycroft"));
        books.add(new Book(12, "Java 8 In Action", 752, "Alan Mycroft"));
        return books;
    }
}

class Book implements Comparable<Book> {

    private int id;
    private String title;
    private int pageCount;
    private String author;

    public Book(int id, String title, int pageCount, String author) {
        this.id = id;
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public int compareTo(Book book) {
        return title.compareTo(book.getTitle());
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", author='" + author + '\'' +
                '}';
    }
}
