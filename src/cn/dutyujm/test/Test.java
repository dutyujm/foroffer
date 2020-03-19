package cn.dutyujm.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class Test {
    static int i = 0;

    public static void main(String[] args) throws ExecutionException {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Test.i=Test.i+1;
                if (Test.i == 8 ){
                    throw new Exception("excp");
                }
                return Test.i+"";
            }
        };
        ArrayList<FutureTask> futureTasks = new ArrayList<>();
        for (int j = 0; j < 10 ; j++) {
            futureTasks.add(new FutureTask(callable));
        }

        for (int j = 0; j < 10; j++) {
            fixedThreadPool.submit(futureTasks.get(i));
            try {
                futureTasks.get(i).get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}




