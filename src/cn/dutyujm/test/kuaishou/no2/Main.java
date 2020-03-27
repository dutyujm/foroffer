package cn.dutyujm.test.kuaishou.no2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String[] strings = string.split(" ");

        int[] ints= new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            ints[i]=Integer.parseInt(strings[i]);
        }
        ArrayList<Integer> integers = find(ints);
        if (integers.size()>0) {
            for (Integer integer : integers) {
                System.out.print(integer+" ");
            }
        }else {
            System.out.println(-1);
        }

    }
    public static ArrayList<Integer> find(int[] ints){
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            int num =0 ;
            int tar = ints[i];
            for (int j = 0; j < i; j++) {
                if (ints[j]>tar){
                    num++;
                }
            }
            if (num==1){
                integers.add(i);
            }
        }
        return integers;
    }
}
