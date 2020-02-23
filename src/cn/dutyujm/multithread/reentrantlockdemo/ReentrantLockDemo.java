package cn.dutyujm.multithread.reentrantlockdemo;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    public static void main(String[] args) {
        ReentrantLock reentrantLock =new ReentrantLock();

            for (int i = 0; i < 10 ; i++) {
                reentrantLock.lock();
                System.out.println("加锁+"+i+"次");
            }
            for (int i = 0; i < 10 ; i++) {
                try {
                    System.out.println("解锁+"+i+"次");
                }finally {
                    reentrantLock.unlock();
                }
        }

    }
}
