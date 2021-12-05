package com.muhammedtopgul.javamasterclass.javaApi;

import java.util.StringTokenizer;

/**
 * @author muhammed-topgul 
 * @created at 21.11.2021 19:40
 */

public class StringTokenizerExample {

    public static void main(String[] args) {
        String text = "Java is the best in the world.";

        StringTokenizer stringTokenizer = new StringTokenizer(text, " ", false);
        while (stringTokenizer.hasMoreElements())
            System.out.println(stringTokenizer.nextToken());
    }
}
