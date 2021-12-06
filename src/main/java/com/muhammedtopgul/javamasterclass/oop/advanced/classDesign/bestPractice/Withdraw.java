package com.muhammedtopgul.javamasterclass.oop.advanced.classDesign.bestPractice;

import com.muhammedtopgul.javamasterclass.oop.advanced.classDesign.exception.InsufficientBalanceException;

/**
 * @author muhammed-topgul
 * @created at 06.12.2021 10:10
 */

public class Withdraw implements AccountAction {

    @Override
    public double action(double balance, double amount) throws InsufficientBalanceException {
        balance -= amount;
        if (balance < 0) {
            throw new InsufficientBalanceException("Available balance is " + balance + ". You cannot withdraw " + amount);
        }
        return balance;
    }
}
