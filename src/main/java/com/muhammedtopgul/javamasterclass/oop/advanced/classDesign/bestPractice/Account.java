package com.muhammedtopgul.javamasterclass.oop.advanced.classDesign.bestPractice;

import com.muhammedtopgul.javamasterclass.oop.advanced.classDesign.exception.InsufficientBalanceException;
import com.muhammedtopgul.javamasterclass.oop.advanced.classDesign.exception.NegativeAmountException;

/**
 * @author muhammed-topgul
 * @created at 06.12.2021 10:05
 */

public class Account {

    private int id;
    private double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void changeBalance(AccountAction accountAction, double amount) throws NegativeAmountException, InsufficientBalanceException {
        if (amount < 0) {
            throw new NegativeAmountException(String.valueOf(amount));
        }

        this.balance = accountAction.action(this.balance, amount);

        System.out.println(accountAction.getClass().getSimpleName() + " " +  amount + " for account id: " + id);
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
}
