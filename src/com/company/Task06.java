package com.company;

/**
 * Есть прямоугольник, у которого известна ширина w и высота h.
 * Найти и вывести на консоль периметр и площадь заданного прямоугольника.
 * Высота и ширина прямоуголь- ника должна задаваться константными переменными в коде программы.
 */

public class Task06 {
    public static void main(String[] args) {
        int w = 10; // ширина прямоугольника
        int h = 56; // высота
        // найти периметр и площадь
        int perimeter = 2 * (w + h);
        int square = w * h;
        System.out.println("Периметр равен " + perimeter);
        System.out.println("Площадь равна " + square);

    }
}
