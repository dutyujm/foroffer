package cn.dutyujm.multithread.mashibing.msb001;

public class T {
    private int count = 10;
    public synchronized void m() {
            count--;
            System.out.println(Thread.currentThread().getName()+"count="+count);
    }
}
