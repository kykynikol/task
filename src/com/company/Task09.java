package com.company;

import java.util.Scanner;

/**
 * Проверить, имеет ли число вещественную часть. Например,
 * числа 3.14 и 2.5 – имеют вещественную часть, а числа 5.0 и 10.0 – нет.
 */

public class Task09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число");
        double digit = input.nextDouble();
        if (digit%1>0){
            System.out.println("Число имеет вещественную часть");
        } else
            System.out.println("Число не имеет вещественную часть");
    }
}
