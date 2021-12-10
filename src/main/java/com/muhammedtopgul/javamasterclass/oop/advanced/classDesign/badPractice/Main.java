package com.muhammedtopgul.javamasterclass.oop.advanced.classDesign.badPractice;

/**
 * @author muhammed-topgul
 * @since 06.12.2021 10:21
 */

public class Main {

    public static void main(String[] args) {
        Account account = new Account(1, 1000);

        try {
            account.changeBalance("deposit", 20);
            System.out.println(account.getBalance());

            account.changeBalance("withdraw", 150);
            System.out.println(account.getBalance());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
