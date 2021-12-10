package com.muhammedtopgul.javamasterclass.functionalProgramming.anonymousClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * @author muhammed-topgul
 * @since 08.12.2021 21:38
 */

public class TimerExample1 {

    public static void main(String[] args) {
        ActionListener actionListener = new TimePrinter1();
        Timer timer1 = new Timer(1000, actionListener);
        // timer1.start();

        Timer timer2  = new Timer(1000, new HelloPrinter());
        // timer2.start();

        actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Timer3");
                Toolkit.getDefaultToolkit().beep();
            }
        };

        Timer timer3 = new Timer(1000, actionListener);
        timer3.start();

        Timer timer4 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Timer4");
                Toolkit.getDefaultToolkit().beep();
            }
        });
        timer4.start();

        Timer timer5 = new Timer(1000, (e) -> {
            System.out.println("Timer5");
            Toolkit.getDefaultToolkit().beep();
        });
        timer5.start();

        JOptionPane.showMessageDialog(null, "Quit Program?");
        System.exit(0);
    }
}

class TimePrinter1 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}

class HelloPrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello :)");
        Toolkit.getDefaultToolkit().beep();
    }
}
