package cn.dutyujm.multithread.mashibing;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Nice {

    // 需要打印的资源: 0~100
    private static int count = 0;

    // 通过condition控制线程竞争
    private static final ReentrantLock lock = new ReentrantLock();
    private static final Condition condition1 = lock.newCondition();
    private static final Condition condition2 = lock.newCondition();

    public static void main(String[] args) {
        Process process = new Process() {
            @Override
            public OutputStream getOutputStream() {
                return null;
            }

            @Override
            public InputStream getInputStream() {
                return null;
            }

            @Override
            public InputStream getErrorStream() {
                return null;
            }

            @Override
            public int waitFor() throws InterruptedException {
                return 0;
            }

            @Override
            public int exitValue() {
                return 0;
            }

            @Override
            public void destroy() {

            }
        };
        // 启用线程池
        ExecutorService executorService = Executors.newCachedThreadPool();

        // 先从0，偶数开始
        executorService.execute(() -> {
            while (count <= 100) {
                try {
                    lock.lock();
                    System.out.println("偶: " + count);
                    count++;
                    // 把偶数线程阻塞
                    condition1.await();
                    // 把奇数线程唤醒
                    System.out.println("开始睡觉");
                    Thread.sleep(3000);
                    condition2.signal();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("我放弃了");
                    lock.unlock();
                }
            }
        });
        executorService.execute(() -> {
            while (count <= 100) {
                try {
                    lock.lock();
                    System.out.println("奇: " + count);
                    count++;
                    // 把偶数线程唤醒
                    condition1.signal();
                    System.out.println("ssss");
                    // 把奇数线程阻塞
                    condition2.await();
                    System.out.println("mmmm");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("dddddd");
                    lock.unlock();
                }
            }
        });
        executorService.shutdown();
    }
}