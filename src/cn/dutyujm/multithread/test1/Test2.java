package cn.dutyujm.multithread.test1;

import java.util.Iterator;
import java.util.Map;

public class Test2 {

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
            Map<Thread,StackTraceElement[]> map = Thread.getAllStackTraces();
            if(map != null && map.size()!=0){
                Iterator keyIterator = map.keySet().iterator();
                while (keyIterator.hasNext()){
                    Thread eachThread = (Thread) keyIterator.next();
                    StackTraceElement [] array  = map.get(eachThread);
                    System.out.println("每个线程的基本信息");
                    System.out.println("   线程名称："+eachThread.getName());
                    System.out.println("StackTraceElement[].length= "+array.length);
                    System.out.println("线程的状态:" + eachThread.getState());
                    if (array.length!=0) {
                        System.out.println("输出StackTraceElement[]数组具体信息：");
                        for (int i = 0; i < array.length; i++) {
                            StackTraceElement eachElement = array[i];
                            System.out.println("       "+eachElement.getClassName()+" "+ eachElement.getMethodName()+"  "+ eachElement.getFileName()+ " "+eachElement.getLineNumber());

                        }
                    }else {
                        System.out.println("没有StackTraceElement[]信息，因为线程"+eachThread.getName()+"中的StackTraceElement[].length = 0");
                    }
                    System.out.println();
                    System.out.println();
                }
            }

        }

        public static void main(String[] args) {
            Test2 test2 = new Test2();
            test2.a();
        }
    }


