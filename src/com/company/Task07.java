package com.company;

/**
 * Разработать программу, которая позволит при известном годовом проценте вычислить сумму
 * вклада в банке через два года, если задана исходная величина вклада.
 */

public class Task07 {
    public static void main(String[] args) {
        double year = 2.0;
        double deposit = 234567.0; // сумма вклада
        double percent = 10.5; // годовой процент
        double resalt = deposit;
        for (int i = 1; i <= year; i++) {
            resalt += resalt * percent / 100;
        }
        System.out.println(resalt);


    }
}
