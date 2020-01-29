package cn.dutyujm.multithread.test1;

public class Test1 {
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
        StackTraceElement[] array  = Thread.currentThread().getStackTrace();
        if(array!=null){
            for (int i = 0; i < array.length; i++) {
                StackTraceElement element = array[i];
                System.out.println("classRoom ="+element.getClassLoaderName()+" methodName = "+element.getMethodName()+" fileName ="+element.getFileName()
                                    +" lineNumber = "+element.getLineNumber());

            }
        }
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.a();
    }
}
