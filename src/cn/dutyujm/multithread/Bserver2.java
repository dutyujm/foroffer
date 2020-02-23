package cn.dutyujm.multithread;

public class Bserver2 extends Aserver implements Runnable{
    @Override
    public void run() {
     b_save_method();
     super.a_save_method();
    }
    public void b_save_method() {
        System.out.println("b中的保存数据方法被执行");
    }

    public static void main(String[] args) {
        Bserver2 bserver2 = new Bserver2();
        bserver2.run();

    }

}
