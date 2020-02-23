package cn.dutyujm.multithread.threadcomunication;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    static class Work implements Runnable {
        private Semaphore semaphore;

        public Work( Semaphore semaphore) {
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName()+"请求机器");
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName()+" 开始工作");
                Thread.sleep(2000);
                semaphore.release();
                System.out.println(Thread.currentThread().getName()+" 使用完毕");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }

    public static void main(String[] args) {
        int works = 8;
        Semaphore semaphore =new Semaphore(3);
        for (int i = 0; i < works; i++) {
            new Thread(new Work(semaphore)).start();
        }
    }
}
