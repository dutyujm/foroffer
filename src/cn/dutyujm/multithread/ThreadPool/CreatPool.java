package cn.dutyujm.multithread.ThreadPool;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.*;

public class CreatPool {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ExecutionException, InterruptedException {

        //核心线程池大小为0，最大线程池大小不受限，来一个创建一个线程
        //适合用来执行大量耗时较短且提交频率较高的任务,需要启动线程就起，不在乎上限
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        //适合有频繁的线程执行
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(9);
        //只创建一个线程，可以保证顺序地进行任务，同时只有一个进程进行活动
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        ExecutorService executorService = Executors.newWorkStealingPool();
        //定时地执行任务
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);

            Callable<String> ca1  = () -> {
                Thread.sleep(500);
                return "sss";
            };
            FutureTask<String> ft1 = new FutureTask<>(ca1);

        for (int i = 0; i < 10; i++) {
            cachedThreadPool.submit(ft1);
            cachedThreadPool.submit(ca1);
        }
        CompletableFuture<String> future =  CompletableFuture.supplyAsync(()-> "null");
        CompletableFuture<String> future2 = future.thenApplyAsync((result) -> result+"sss");
        CompletableFuture<String> future3 = future2.thenApplyAsync((result) -> result+"sss");

        future.exceptionally((e) -> {
            e.printStackTrace();
            return null;
        });

        System.out.println(future3.get());

//        ExecutorService executorService = Executors.newWorkStealingPool();

//
//        Callable<Integer> a = new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                System.out.println("ssssss");
//                return 1;
//            }
//        };
//
//
//
//        FutureTask<Integer> futureTask = new FutureTask<>(a);
//        new Thread(futureTask).start();
//
//        for (int i = 0; i <10 ; i++) {
//            fixedThreadPool.execute(futureTask);
//            futureTask.get();
//        }
//        System.out.println(futureTask.get());
//        System.out.println("sss");
//
//        scheduledThreadPool.scheduleAtFixedRate(()->{
//            System.out.println(Thread.currentThread().getName());
//        },0,500,TimeUnit.MILLISECONDS);
//        System.gc();
    }
}
