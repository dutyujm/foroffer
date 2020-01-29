package cn.dutyujm.multithread.t7;

public class run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println("begin= " + myThread.isAlive());
        myThread.start();
        Thread.sleep(1000);
        System.out.println("end  = " +myThread.isAlive());

    }
}
