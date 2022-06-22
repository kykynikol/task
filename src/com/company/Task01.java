package com.company;

/**
 * В переменных х и y хранятся два натуральных числа. Создайте программу, выводящую на консоль:
 * результат целочисленного деления x на y;
 * остаток от деления x на y;
 * квадратный корень x.
 */


public class Task01 {
    public static void main(String[] args) {


        int x = 256;
        int y = 4;

        System.out.println(x/y);
        System.out.println(x%y);
        System.out.println(Math.sqrt(x));
    }
}
