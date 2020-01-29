package cn.dutyujm.javalearn.breakpoint;

import java.util.Objects;

public class BreakPoint   {

    public static void back(){
        System.out.println("从这里回退");
    }

    public static void main(String[] args) {
        int i = 0;
        BreakPoint.back();
        Objects.equals(1,2);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable,"线程1");
        Thread thread2 = new Thread(myRunnable,"线程2");
        Thread thread3 = new Thread(myRunnable,"线程3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
