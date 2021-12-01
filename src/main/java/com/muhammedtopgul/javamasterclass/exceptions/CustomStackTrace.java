package com.muhammedtopgul.javamasterclass.exceptions;

/**
 * @author muhammed-topgul created at 01/12/2021 16:33
 */

public class CustomStackTrace {

    public static void main(String[] args) throws Throwable {
        CustomStackTrace customStackTrace = new CustomStackTrace();
        customStackTrace.methodOne();
        System.out.println("Will Be Not in Console ");
    }

    public void methodOne() throws Throwable {
        methodTwo();
    }

    private void methodTwo() throws Throwable {
        Throwable throwable = new Throwable("Just kidding :)");
        throwable.printStackTrace();
        printStackTraceForThrowable(throwable);
		throw throwable;
    }

    public void printStackTraceForThrowable(Throwable throwable) {
        System.out.println("\n* * * Stack Trace * * *");
        StackTraceElement[] traces = throwable.getStackTrace(); // Thread.currentThread().getStackTrace();
        for (StackTraceElement trace : traces) {
            System.out.println("\nNew stack info:");
            System.out.println("File name: " + trace.getFileName());
            System.out.println("Class name: " + trace.getClassName());
            System.out.println("Method name: " + trace.getMethodName());
            System.out.println("Line number: " + trace.getLineNumber());
        }
    }
}
