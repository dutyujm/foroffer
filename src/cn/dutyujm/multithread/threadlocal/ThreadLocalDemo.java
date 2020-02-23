package cn.dutyujm.multithread.threadlocal;

public class ThreadLocalDemo {

    static class Bank {
        private ThreadLocal<Integer> threadLocal = new ThreadLocal<>() {
            @Override
            protected Integer initialValue(){
                return 0;
            }
        };


        public Integer get() {
            return threadLocal.get();
        }
        public void set(Integer money) {
            threadLocal.set(threadLocal.get()+money);
        }

    }
    static class Tansfer implements Runnable {
        private Bank bank ;

        public Tansfer(Bank bank) {
            this.bank = bank;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10 ; i++) {
                bank.set(10);
                System.out.println(Thread.currentThread().getName()+"有"+bank.get());
            }
        }
    }

    public static void main(String[] args) {
        Bank bank =new Bank();
        Tansfer tansfer =new Tansfer(bank);
        Thread thread1 = new Thread(tansfer+"线程1");
        Thread thread2 = new Thread(tansfer+"线程2");
        thread1.start();
        thread2.start();


    }
}
