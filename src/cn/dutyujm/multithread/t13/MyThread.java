package cn.dutyujm.multithread.t13;

/**
 * @author yu
 */
public class MyThread extends  Thread {
    @Override
    public void run(){
        super.run();
        try{
        for (int i = 0; i < 5000; i++) {
            if (interrupted()) {
                System.out.println("sss");
                throw new InterruptedException();
            }
        }}catch (InterruptedException e) {
            System.out.println("catch了");
            e.printStackTrace();
        }
    }
}
