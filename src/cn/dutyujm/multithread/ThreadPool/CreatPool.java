package cn.dutyujm.multithread.ThreadPool;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class CreatPool {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        //适合有频繁的线程执行
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        //只创建一个线程，可以保证顺序地进行任务，同时只有一个进程进行活动
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        //定时地执行任务
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);

        Class a = scheduledThreadPool.getClass();
        a.getDeclaredConstructor().newInstance();

    }
}
