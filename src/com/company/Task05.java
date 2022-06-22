package com.company;

/**
 * Подсчитать площадь и длину окружности для круга с радиусом R.
 * Радиус должен быть задан константой в программе. Вывести результат на консоль.
 */


public class Task05 {
    public static void main(String[] args) {
        final int r = 5;
        double square = Math.PI * Math.pow(r,2);
        System.out.println("Площадь круга = " + square);
        double circumference = 2 * Math.PI * r;
        System.out.println("Длина окружности = " + circumference);


    }
}
