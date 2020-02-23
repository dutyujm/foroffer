package cn.dutyujm.multithread.threadcomunication;

import java.util.concurrent.CountDownLatch;

public class CoachRacerDemo {
    private CountDownLatch countDownLatch = new CountDownLatch(3);
    private void racer() {
        String name =Thread.currentThread().getName();
        System.out.println("racer"+name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name +"end");
        countDownLatch.countDown();
    }
    private void coach() {
        String name =Thread.currentThread().getName();
        System.out.println("Coach"+name+"is waiting ");
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+"all ok");
    }

    public static void main(String[] args) {
        CoachRacerDemo coachRacerDemo =new CoachRacerDemo();
        Thread thread1 =new Thread(()->coachRacerDemo.racer(),"no1");
        Thread thread2 =new Thread(()->coachRacerDemo.racer(),"no2");
        Thread thread3 =new Thread(()->coachRacerDemo.racer(),"no3");
        Thread thread4 = new Thread(()->coachRacerDemo.coach(),"no1433");
        thread4.start();
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
