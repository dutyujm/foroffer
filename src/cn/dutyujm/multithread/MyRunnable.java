package cn.dutyujm.multithread;

public class MyRunnable implements  Runnable {
    @Override
    public void run() {
        System.out.println("跑啊跑");
        System.out.println(Thread.currentThread().getName());

    }
}
