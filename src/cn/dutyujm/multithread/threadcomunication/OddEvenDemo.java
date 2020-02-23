package cn.dutyujm.multithread.threadcomunication;

public class OddEvenDemo {
    private Integer i =1 ;
    private Object object = new Object();

    public void odd()   {
        while (i<10){
            synchronized (object) {
                if(i%2==1) {
                    System.out.println("奇数"+i);
                    i++;
                    object.notify();//唤醒偶数线程
                }else {
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public void even()  {
        while (i<10) {
            synchronized (object) {
                if (i % 2 == 0) {
                    System.out.println("偶数" + i);
                    i++;
                    object.notify();//唤醒奇数线程
                } else {
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        OddEvenDemo demo = new OddEvenDemo();
        Thread thread =new Thread(()->demo.odd());
        Thread thread2 =new Thread(()->demo.even());
        thread.start();
        thread2.start();
    }
}
