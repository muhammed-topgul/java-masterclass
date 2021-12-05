package com.muhammedtopgul.javamasterclass.flowControls.draw;

/**
 * @author muhammed-topgul 
 * @created at 31.10.2021 23:00
 */

public class Rectangle {

    public static void main(String[] args) {
        drawFilledRectangle(10, 10);
        System.out.println("\n");
        drawVoidRectangle(10, 10);
    }

    public static void drawFilledRectangle(int h, int w) {
        StringBuilder shape = new StringBuilder();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                shape.append("*");
            }
            shape.append("\n");
        }
        System.out.println(shape);
    }

    public static void drawVoidRectangle(int h, int w) {
        StringBuilder shape = new StringBuilder();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if ((i == 0 || i == h - 1) || (j == 0 || j == w - 1)) {
                    shape.append("*");
                } else {
                    shape.append(" ");
                }
            }
            shape.append("\n");
        }
        System.out.println(shape);
    }
}
