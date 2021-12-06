package com.muhammedtopgul.javamasterclass.oop.advanced.classDesign.exception;

/**
 * @author muhammed-topgul
 * @created at 06.12.2021 09:54
 */

public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
