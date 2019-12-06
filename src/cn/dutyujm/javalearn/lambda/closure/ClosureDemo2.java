package cn.dutyujm.javalearn.lambda.closure;

import java.util.function.Consumer;

public class ClosureDemo2 {
    public static void main(String[] args) {
        int a =10;
        //在lanbda中变量是常量final,不可变了
        Consumer<Integer> c = ele ->{
            System.out.println(a);
        };

        c.accept(a);
    }
}
