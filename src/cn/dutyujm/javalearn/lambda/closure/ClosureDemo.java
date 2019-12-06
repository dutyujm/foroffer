package cn.dutyujm.javalearn.lambda.closure;

import java.util.function.Supplier;

public class ClosureDemo {
    public static void main(String[] args) {
        int n= getNumber().get();
        System.out.println(n);
    }
    /**闭包可以提升变量的生命周期*/

    private static Supplier<Integer> getNumber() {
        int num = 10;
        return ()->{
            return num;
        };
    }
}
