package cn.dutyujm.test;

import java.util.HashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedBuffer {
    public static void main(String[] args) {
        BoundedBuffer b = new BoundedBuffer();
            new Thread(()->{
                while (true) {
                    b.put();
                }
            }).start();
        new Thread(()->{
            while (true) {
                b.take();
            }
        }).start();



    }
    final Lock lock = new ReentrantLock();
    final Condition notFull  = lock.newCondition();
    final Condition notEmpty = lock.newCondition();
    final Integer[] items = new Integer[1024];
    int putptr = 0, takeptr = 0, count = 0;

    public void put( )   {

        lock.lock();
        try {
            while(count>1023){
                    notFull.await();
            }

                System.out.println("在"+putptr%1024+"放一个");
                items[putptr%1024] = 1;
                putptr++;
                count++;
            System.out.println("剩余"+count+"个");

            notEmpty.signal();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public Object take()   {
        lock.lock();
        try {
            while (count==0){
               notEmpty.await();
            }
            System.out.println("在"+takeptr%1024+"取一个");

            items[takeptr%1024] = 0;
            takeptr++;
            count--;
            System.out.println("剩余"+count+"个");
            notFull.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return null;
    }
}
