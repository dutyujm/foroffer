package cn.dutyujm.test.pingduoduo.no2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @ClassName Main
 * @Description 多多路上从左到右有N棵树(编号1 ~ N)，其中第1个颗树有 和谐值Ai。
 * 多多鸡认为，如果-段连续的树，它们的和谐值之和可以被M整除，那么这个区间整体看
 * 起来就是和谐的。
 * 现在多多鸡想请你帮忙计算一下， 满足和谐条件的区间的数量。
 * @Author yu
 * @Date 2020/4/10 19:27
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int M = in.nextInt();
        int[] array =new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = in.nextInt();
        }

        System.out.println(subarraysDivByK(array,M));
    }
    public static int subarraysDivByK(int[] A, int K) {
        int N = A.length;
        int sum = 0;
        int  ans = 0;
        int[] map = new int[K];
        map[0] = 1;
        for (int i = 1; i <= N; i++) {
            sum = sum + A[i-1];
            int key = (sum % K + K) % K;
            ans += map[key];
            map[key]++;
        }
        return ans;
    }

}
