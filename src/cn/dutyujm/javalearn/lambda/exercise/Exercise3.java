package cn.dutyujm.javalearn.lambda.exercise;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list,1,2,3,4,5,6,7,8,9,0);

        list.forEach(ele -> {
            if (ele %2 ==0){
                System.out.println(ele);
            }
        });

    }
}
