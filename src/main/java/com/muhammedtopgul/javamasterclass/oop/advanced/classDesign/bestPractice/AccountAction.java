package com.muhammedtopgul.javamasterclass.oop.advanced.classDesign.bestPractice;

import com.muhammedtopgul.javamasterclass.oop.advanced.classDesign.exception.InsufficientBalanceException;

/**
 * @author muhammed-topgul
 * @since 06.12.2021 10:06
 */

public interface AccountAction {

    double action(double balance, double amount) throws InsufficientBalanceException;
}
