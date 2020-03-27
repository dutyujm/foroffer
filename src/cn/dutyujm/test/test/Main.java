package cn.dutyujm.test.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        FutureTask<String> task = new FutureTask<>(()->{
            return "sss";
        });
        Future<String> future = new FutureTask<>(()->{
            return "ss";
        });
        executorService.submit(task);

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


        try {
            System.out.println(task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
