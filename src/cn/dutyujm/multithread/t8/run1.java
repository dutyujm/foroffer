package cn.dutyujm.multithread.t8;

public class run1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        System.out.println("begin="+System.currentTimeMillis());
        myThread1.run();
        System.out.println("end"+System.currentTimeMillis());
    }
}
