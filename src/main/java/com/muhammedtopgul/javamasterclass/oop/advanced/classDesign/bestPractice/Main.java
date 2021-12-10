package com.muhammedtopgul.javamasterclass.oop.advanced.classDesign.bestPractice;

/**
 * @author muhammed-topgul
 * @since 06.12.2021 10:24
 */

public class Main {

    public static void main(String[] args) {
        Account account = new Account(1, 1000);

        try {
            account.changeBalance(new Deposit(), 20);
            System.out.println(account.getBalance());

            account.changeBalance(new Withdraw(), 150);
            System.out.println(account.getBalance());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
