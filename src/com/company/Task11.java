package com.company;


import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

/**
 * У Деда Мороза есть часы, которые в секундах показывают, сколько осталось до каждого Нового года.
 * Так как Дед Мороз – человек уже в возрасте, то некоторые математические операции он быстро выполнять не в состоянии.
 * Помогите Деду Морозу определить, сколько полных дней, часов, минут и секунд осталось до следующего Нового года,
 * если известно сколько осталось секунд. Т. е. разложите время в секундах на полное количество дней,
 * часов, минут и секунд. Выведите результат на консоль.
 * Пример, как должен выглядеть вывод результата:
 * 10 дней, 14 часов, 5 минут и 33 секунды
 */

public class Task11 {
    public static void main(String[] args) {
        long timeOfSeconds= 18789765;
        LocalDateTime time = LocalDateTime.ofEpochSecond(timeOfSeconds,0, ZoneOffset.UTC);
        System.out.println("Дней осталось " +time.getDayOfYear());
        System.out.println("Часов осталось " +time.getHour());
        System.out.println("Минут осталось " +time.getMinute());
        System.out.println("Секунд осталось " +time.getSecond());
    }
}
