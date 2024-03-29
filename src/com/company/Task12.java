package com.company;

/**
 *Ученикам первого класса дают 1 пирожок.
 * Если вес первоклассника менее 30 кг, дополнительно дают 1 стакан молока и ещё 1 пирожок.
 * В первых классах школы учится n учеников. Стакан молока имеет емкость 200 мл, а упаковка молока – 0,9 л.
 * Написать программу, которая определит количество пакетов молока и пирожков, необходимых каждый день для условий:
 * ■ если в школе 100% всех учеников, у которых вес меньше 30 кг;
 * ■ если в школе 60% учеников имеют вес меньше 30 кг.
 * ■ если в школе 1% учеников имеют вес меньше 30 кг.
 * (!!!) Учесть, что нельзя купить два с половиной пакета молока; можно купить два или три.
 */

public class Task12 {
    public static void main(String[] args) {
        int n = 15;
        int minWeight = 30;
        double cup = 200;
        double milk = 900;
        double resultMilk = Math.ceil(n * cup / milk);
        int pie = n * 2;
        System.out.println("100% всех учеников, у которых вес меньше 30 кг, то молока " + resultMilk + " пирожков " + pie );
        double resultMilk1 = Math.ceil(n * 0.6 * cup / milk);
        double pie1 = n * 0.6;
        System.out.println("60% учеников имеют вес меньше 30 кг, то молока " + resultMilk1 + " пирожков " + pie1);
        double resultMilk2 = Math.ceil(n * 0.1 * cup / milk);
        double pie2 = Math.ceil(n * 0.1);
        System.out.println("1% учеников имеют вес меньше 30 кг, то молока " + resultMilk2 + " пирожков " + pie2);

    }
}
