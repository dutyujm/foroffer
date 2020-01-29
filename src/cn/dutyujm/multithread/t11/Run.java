package cn.dutyujm.multithread.t11;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(2000);
        myThread.interrupt();
        System.out.println("zzzzzzzzzzzzzzzz");
    }
}
