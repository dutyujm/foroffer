package cn.dutyujm.multithread.t8;

public class run2 {
    public static void main(String[] args) {
        MyThread2 myThread2= new MyThread2();
        myThread2.setName("ddd");
        Thread thread = new Thread(myThread2);
        System.out.println("begin= "+System.currentTimeMillis());
//        thread.setName("sss");
        thread.start();
        myThread2.start();
        System.out.println("end = "+System.currentTimeMillis());
    }
}
