package cn.dutyujm.test.alibaba.no1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextInt();
        }
        cal(a);
    }

    public static void cal(int []arr) {
        int [] duiZi = new int[10];
        for (int i = 0; i < 10; i++) {
            if (arr[i]==2) {
                duiZi[i] = 1;
            }else if (arr[i]==4) {
                duiZi[i] = 2;
            }if (arr[i]==3) {
                duiZi[i] = 1;
                arr[i] = 1;
            }
        }

    }
}
