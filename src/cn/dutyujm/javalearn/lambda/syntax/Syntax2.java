package cn.dutyujm.javalearn.lambda.syntax;

import cn.dutyujm.javalearn.lambda.interfaces.*;

public class Syntax2 {
    public static void main(String[] args) {


        LambdaNRMP lambdaNRMP = (a, b) -> {
            System.out.println("NRMP");
        };

        LambdaNRSP lambdaNRSP = a ->{
            System.out.println("NRSP");
        };

        LambdaSRNP lambdaSRNP = () -> 10;

        LamdbaSRMP lamdbaSRMP = (a,b) -> a+b;

        LamdbaSRSP lamdbaSRSP = Syntax2::change;

        System.out.println(lamdbaSRSP.test(1));

        
    }
    private static int change(int a) {
        return a*2;
    }

}
