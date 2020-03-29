package cn.dutyujm.multithread.readwritelockdemo;

import java.util.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteDemo {
    private Map<String,String> map = new HashMap<String,String>();//操作的map对象
    private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private ReentrantReadWriteLock.ReadLock readLock = readWriteLock.readLock();//读锁
    private ReentrantReadWriteLock.WriteLock writeLock = readWriteLock.writeLock();//写锁

    public String get( String key) {
        readLock.lock();//读操作加锁
        try{
            System.out.println(Thread.currentThread().getName()+"读操作加锁");
            Thread.sleep(3000);
            return map.get(key);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("读操作解锁");
            readLock.unlock();
        }
        return null;
    }
    public String put( String key,String value) {
        writeLock.lock();//读操作加锁
        try{
            System.out.println(Thread.currentThread().getName()+"写操作加锁");
            Thread.sleep(3000);
            return map.put(key,value);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("写操作解锁");
            writeLock.unlock();
        }
        return null;
    }

    public static void main(String[] args) {
        ReadWriteDemo readWriteDemo =new ReadWriteDemo();
        readWriteDemo.put("key1","key2");
        Thread thread1 = new Thread(()->System.out.println(readWriteDemo.get("key1")),"读线程1");
        Thread thread2 = new Thread(()->System.out.println(readWriteDemo.get("key1")),"读线程2");
        Thread thread3 = new Thread(()->System.out.println(readWriteDemo.get("key1")),"读线程3");
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
