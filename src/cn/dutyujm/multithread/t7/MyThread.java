package cn.dutyujm.multithread.t7;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run =  "+ this.isAlive());
    }
}
