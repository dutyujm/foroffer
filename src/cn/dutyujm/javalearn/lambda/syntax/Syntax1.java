package cn.dutyujm.javalearn.lambda.syntax;

import cn.dutyujm.javalearn.lambda.interfaces.*;

public class Syntax1{
    public static void main(String[] args) {

        LambdaNRNP lambdaNRNP = () -> {
            System.out.println("NRNP");
        };
        lambdaNRNP.test();

        LambdaNRSP lambdaNRSP = (int n) ->{
            System.out.println(n);
        };
        lambdaNRSP.test(10);

        LambdaNRMP lambdaNRMP = (int a,int b) ->{
            System.out.println(a+" "+b);
        };
        lambdaNRMP.test(1,2);

        LambdaSRNP lambdaSRNP = () ->{
            System.out.println("SRNP");
            return 4;
        };
        System.out.println(lambdaSRNP.test());

        LamdbaSRSP lamdbaSRSP = (int a) -> {
            return a;
        };
        System.out.println(lamdbaSRSP.test(5));

        LamdbaSRMP lamdbaSRMP = (int a,int b) -> {
          return  a+b;
        };
        System.out.println(lamdbaSRMP.test(10,20));
    }

}
