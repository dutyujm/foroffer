package cn.dutyujm.multithread.test1;

public class Test6 {
    public  void a(){
        b();
    }
    public  void b(){
        c();
    }
    public  void c(){
        d();
    }
    public  void d(){
        e();
    }
    public  void e(){
       int age = 0;
       age = 100;
       if(age == 100){
           Thread.dumpStack();
       }

    }

    public static void main(String[] args) {
        Test6 test6 = new Test6();
        test6.a();
    }
}
