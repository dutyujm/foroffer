package cn.dutyujm.multithread.t8;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run threadName = " + currentThread().getName()+"begin");
            Thread.sleep(2000);
            System.out.println("run threadName = " + currentThread().getName()+"end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
