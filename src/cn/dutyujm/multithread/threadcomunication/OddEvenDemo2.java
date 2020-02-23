package cn.dutyujm.multithread.threadcomunication;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OddEvenDemo2 {
    private Integer i =1 ;
    private Lock lock =new ReentrantLock();
    private Condition condition =lock.newCondition();

    public void odd()   {
        while (i<10){
            lock.lock();
            try {
                if(i%2==1) {
                    System.out.println("奇数"+i);
                    i++;
                    condition.signal();
                }else {
                    try {
                        condition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }finally {
                lock.unlock();
            }
        }
    }
    public void even()  {
        while (i<10) {
            lock.lock();
            try {
                if (i % 2 == 0) {
                    System.out.println("偶数" + i);
                    i++;
                    condition.signal();//唤醒奇数线程
                } else {
                    try {
                        condition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }finally {
            lock.unlock();
        }
        }
    }

    public static void main(String[] args) {
        OddEvenDemo demo = new OddEvenDemo();
        Thread thread =new Thread(()->demo.odd());
        Thread thread2 =new Thread(()->demo.even());
        thread.start();
        thread2.start();
    }
}
