package cn.dutyujm.test.baidu.no2;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @ClassName Main
 * @Description TODO
 * @Author yu
 * @Date 2020/3/29 19:53
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int k = 0;
        while (ifAllLittle(a,n)) {
            int max =findMax(a);
            a[max] = a[max]-n;
            addOne(a,max);
            k++;
        }
        System.out.println(k);
    }

    public static void addOne(int[] arr,int p) {
        for (int i = 0; i < arr.length; i++) {
            if (i!=p) {
                arr[i]=arr[i]+1;
            }
        }
    }

    public static boolean ifAllLittle(int[] arr,int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=n) {
                return true;
            }
        }
        return false;
    }

    public static int findMax(int[] arr) {

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
