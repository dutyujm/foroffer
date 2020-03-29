package cn.dutyujm.test.baidu.no1;

import java.util.Scanner;

/**
 * @ClassName Main
 * @Description TODO
 * @Author yu
 * @Date 2020/3/29 19:29
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] primes = new int[2];
        int count =0;
        for (int i = n; i > 0; i--) {
            if (isPrime(i)){
                primes[count++] = i;
                primes[count] = i-1;
                break;
            }
        }
        int i = primes[0];
        int j = primes[1];
        System.out.println((i * j / gcd(i, j) - gcd(i, j)));

    }
    public static int gcd(int a,int b){
        int min = Math.min(a, b);

        for (int i = min;i >= 1;i --) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return -1;
    }
    private static boolean isPrime(int src) {
        double sqrt = Math.sqrt(src);
        if (src < 2) {
            return false;
        }
        if (src == 2 || src == 3) {
            return true;
        }
        if (src % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= sqrt; i+=2) {
            if (src % i == 0) {
                return false;
            }
        }
        return true;
    }


}
