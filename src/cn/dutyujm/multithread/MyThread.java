package cn.dutyujm.multithread;

public class MyThread extends Thread {
    private int count = 5;

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        while (count>0){
            count--;
            System.out.println("由"+ currentThread().getName()+"计算，count = "+count);
        }
    }

    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");

        a.start();
        b.start();
        c.start();
    }
}
