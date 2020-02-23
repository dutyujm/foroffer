package cn.dutyujm.multithread.threadcomunication;

import java.time.LocalDateTime;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    private CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

    public void startThread() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" 线程准备启动");
        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println(name+" 线程启动完毕"+ LocalDateTime.now());

    }
    public static void main(String[] args) {
        CyclicBarrierDemo cyclicBarrierDemo =new CyclicBarrierDemo();
        Thread thread1 =new Thread(()->cyclicBarrierDemo.startThread(),"no1");
        Thread thread2 =new Thread(()->cyclicBarrierDemo.startThread(),"no2");
        Thread thread3 =new Thread(()->cyclicBarrierDemo.startThread(),"no3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
