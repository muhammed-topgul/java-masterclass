package com.muhammedtopgul.javamasterclass.oop.advanced.classDesign.bestPractice;

/**
 * @author muhammed-topgul
 * @created at 06.12.2021 10:06
 */

public class Deposit implements AccountAction {

    @Override
    public double action(double balance, double amount) {
        return balance + amount;
    }
}
