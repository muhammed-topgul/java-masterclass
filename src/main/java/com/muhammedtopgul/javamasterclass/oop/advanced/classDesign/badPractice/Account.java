package com.muhammedtopgul.javamasterclass.oop.advanced.classDesign.badPractice;

import com.muhammedtopgul.javamasterclass.oop.advanced.classDesign.exception.InsufficientBalanceException;
import com.muhammedtopgul.javamasterclass.oop.advanced.classDesign.exception.NegativeAmountException;

import java.util.logging.Logger;

/**
 * @author muhammed-topgul
 * @since 06.12.2021 09:52
 */

public class Account {

    private int id;
    private double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void changeBalance(String action, double amount) throws NegativeAmountException, InsufficientBalanceException {
        if (amount < 0) {
            throw new NegativeAmountException(String.valueOf(amount));
        }

        if (action.equalsIgnoreCase("deposit")) {
            balance += amount;
        } else if (action.equalsIgnoreCase("withdraw")) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                throw new InsufficientBalanceException("Available balance is " + balance + ". You cannot withdraw " + amount);
            }
        }
        System.out.println(action + ": " + amount + " for account id: " + id);
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
}
