package cn.dutyujm.multithread.t2;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"time="+System.currentTimeMillis()+"次数" +i);

        }
        return "执行完成";
    }
}
