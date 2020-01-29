package cn.dutyujm.multithread;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new MyRunnable();
        Thread thread =new Thread(runnable);

        thread.start();
        System.out.println("结束");






    }
}
