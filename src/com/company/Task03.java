package com.company;

/**
 * В переменной n хранится вещественное число, с ненулевой дробной частью.
 * Создайте программу, округляющую число n до ближайшего целого и выводящую результат округления на экран.
 */
public class Task03 {
    public static void main(String[] args) {
        double x = 769.3456789;
        String otvet = String.format("%.3f",x);
        System.out.print(otvet);
    }
}
