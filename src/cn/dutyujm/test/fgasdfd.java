package cn.dutyujm.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.LongAdder;

public class fgasdfd {
    public static void main(String[] args) {

        LongAdder e = new LongAdder();
        e.add(243432342343234L);
        e.increment();
        e.increment();
        e.increment();
        e.increment();

        System.out.println(e.longValue());
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm", Locale.CHINA)));

    }
}

