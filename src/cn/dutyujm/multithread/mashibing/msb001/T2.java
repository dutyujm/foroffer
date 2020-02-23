package cn.dutyujm.multithread.mashibing.msb001;

import java.util.concurrent.TimeUnit;

public class T2 implements Runnable {
    private int count = 10;
    @Override
    public  void run() {
        count--;
        System.out.println(Thread.currentThread().getName()+"count="+count);
    }

    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        for (int i = 0; i <5 ; i++) {
            new Thread(t2,"THREAD"+i).start();
        }
        TimeUnit.SECONDS.sleep(555);
    }
}
