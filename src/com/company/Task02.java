package com.company;

/**
 *В переменной n хранится натуральное (целое) трехзначное число.
 *Создайте программу, вычисляющую и выводя- щую на экран сумму цифр числа n.
 */
public class Task02 {

    public static void main(String[] args) {
        int n = 516;
        int x = n / 100;
        int y = n % 51;
        int m = y - 5;
        System.out.println("Сумма цифр числа n = " + (x+y+m));



    }
    }

