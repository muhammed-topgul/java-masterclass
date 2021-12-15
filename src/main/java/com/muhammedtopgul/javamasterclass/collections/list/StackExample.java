package com.muhammedtopgul.javamasterclass.collections.list;

import java.util.Stack;

/**
 * @author muhammed-topgul
 * @since 15.12.2021 15:28
 */

public class StackExample {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

//        stack.add("One");
//        stack.add("Two");
        stack.push("Three");
        stack.push("Four");

        System.out.println(stack.peek());
        System.out.println(stack.search("Three"));
        System.out.println(stack.get(0));
       // stack.pop();

        System.out.println();
        for (String s : stack) {
            System.out.println(s);
        }
    }
}
