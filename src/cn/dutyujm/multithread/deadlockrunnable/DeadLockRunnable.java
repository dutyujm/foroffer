package cn.dutyujm.multithread.deadlockrunnable;

import java.util.Objects;

public class DeadLockRunnable implements Runnable{
    private int flag;//决定线程走向的标记
    private  Object object1 = new Object();
    private  Object object2 = new Object();

    public DeadLockRunnable(int flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag ==1) {
            //线程1代码
            flag=2;
            synchronized (object1){
                System.out.println(Thread.currentThread().getName()+"已获取到资源obj1,正在请求2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object2){
                    System.out.println(Thread.currentThread().getName()+"已经获取到obj1和obj2");
                }
            }
        }else{
            //线程2执行代码
            synchronized (object2){
                System.out.println(Thread.currentThread().getName()+"已获取到资源obj2,正在请求1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object1){
                    System.out.println(Thread.currentThread().getName()+"已经获取到obj1和obj2");
                }
            }
        }
    }
}
