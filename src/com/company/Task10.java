package com.company;

import java.util.Scanner;

/**
 * Написать программу расчета идеального веса к росту. В константах хранятся рост (height) и вес (weight).
 * Вывести на консоль сообщение, сколько килограмм нужно набрать или сбросить (идеальный вес = рост - 110).
 */
public class Task10 {
    public static void main(String[] args) {
        final int height;
        final  double weight;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите рост в см");
        height = input.nextInt();
        System.out.println("Введите вес в килограммах");
        weight = input.nextDouble();

        double result = weight - (height-110);
        if(result == 0){
            System.out.println("У вас идеальный вес");
        } else if (result < 0 ){
            System.out.println("Нужно набрать "+Math.abs(result)+ " кг");
        } else {
            System.out.println("Нужно сбросить "+ result+ " кг");
        }




    }
}
