package cn.dutyujm.multithread.deadlockrunnable;

public class Main {
    public static void main(String[] args) {
        DeadLockRunnable deadLockRunnable1 = new DeadLockRunnable(1);
        DeadLockRunnable deadLockRunnable2 = new DeadLockRunnable(2);
        Thread thread =new Thread(deadLockRunnable1,"线程1");
        Thread thread2 =new Thread(deadLockRunnable1,"线程2");
        thread.start();
        thread2.start();
    }
}
