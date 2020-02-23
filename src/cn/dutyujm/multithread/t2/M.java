package cn.dutyujm.multithread.t2;

import cn.dutyujm.multithread.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class M {
    public static void main(String[] args) {
        FutureTask<String> task = new FutureTask<>(new MyCallable());
//        Thread thread = new Thread(task,"MyCallable");
//        thread.start();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName()+" time="+System.currentTimeMillis()+" 次数" +i);
//        }
//        try {
//            System.out.println(task.get());
//        }catch (Exception e) {
//            e.printStackTrace();
//        }

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(task);
        for (int i = 0; i < 10; i++) {
         System.out.println(Thread.currentThread().getName()+" time="+System.currentTimeMillis()+" 次数" +i);
        }
    }
}
