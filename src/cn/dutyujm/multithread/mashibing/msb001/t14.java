package cn.dutyujm.multithread.mashibing.msb001;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class t14 {
    public static void main(String[] args) {
        List<Integer> integerList =new ArrayList<>();
        Random random =new Random();
        for (int i = 0; i < 2000000; i++) {
            integerList.add(random.nextInt());
        }

        long start = System.currentTimeMillis();
        integerList.forEach(v->isPrime(v));
        long end = System.currentTimeMillis();
        System.out.println(end-start);

         start = System.currentTimeMillis();
        integerList.parallelStream().forEach(t14::isPrime);
         end = System.currentTimeMillis();
        System.out.println(end-start);

    }
    static Boolean isPrime(int num) {
        for (int i = 2; i < num/2; i++) {
            if (num%2==0) {
                return false;
            }
        }
        return true;
    }
}
