package cn.dutyujm.javalearn.lambda.exercise;

import java.util.concurrent.atomic.AtomicInteger;

public class Exercise5 {
    public static void main(String[] args) {
         AtomicInteger x = new AtomicInteger();
        Thread t = new Thread(() ->{
            for (int i = 0; i < 100 ; i++) {
                System.out.println(i);
            }
        });
        Thread t2 = new Thread(() ->{
            for (int i = 0; i < 100 ; i++) {
                System.out.println(i);
            }
        });
        Thread t3 = new Thread(() ->{
            for (int i = 0; i < 100 ; i++) {
                System.out.println(i);
            }
        });
        Thread t4 = new Thread(() ->{
            for (int i = 0; i < 100 ; i++) {
                System.out.println(i);
            }
        });
        t.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
