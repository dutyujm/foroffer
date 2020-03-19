package cn.dutyujm.meituan.no5;

import java.util.Scanner;

/**
 * @Author YuJunMing
 * @Date 2020/3/12 19:21
 * DESCRIPTION: 小仓酷爱射击运动。今天的小仓会进行N轮射击，已知第i次射击，她击中靶心的概率是a[i] -1 。
 * 小仓想知道N轮射击后，偏离靶心次数为 0 ,1 ,2 次的概率分别是多少。
 *
 *
 * 不难证明答案可以表示成一个最简分数 p * q -1。
 * 你需要输出三个p * q -1 对 998244353取模后的结果，以此来表示偏离靶心次数为 0 , 1 , 2时的概率。
 * 其中q-1是q 在模意义下的逆元，满足q-1* q = 1 mod 998244353。
 * 例如1/4, 可以写成748683265，原因是4 * 748683265 % 998244353 = 1,也有且仅有x =  748683265，1 <= x < 998244353满足乘积等于1
 */
public class Main {
    public static void main(String[] args) {
        int n =0 ;
        Scanner scanner  = new Scanner(System.in);
        n = scanner.nextInt();
        int []a =  new int [n];
        for (int i = 0; i < n ; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(test(1,2));

    }
    public static int test(int n, int num) {
        if (n == 1){
            return (1/4)%998244353;
        }

        return 0;
    }
}
