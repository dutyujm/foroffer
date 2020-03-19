package cn.dutyujm.test;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class main {
    public static int[] removeDuplicates(int[] input) {
        // TODO
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i<input.length;i++) {
            if(!al.contains(input[i])) {
                al.add(input[i]);
            }
        }
        int []res = new int[al.size()];
        for(int i = 0; i<al.size();i++) {
            res[i] = al.get(i);
        }
        return res;
    }

    public static void main(String a[]) {
        int[] input1 = { 1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10, 11 };
        int[] output = removeDuplicates(input1);
        for (int i : output) {
            System.out.print(i + " ");
        }
    }

}
