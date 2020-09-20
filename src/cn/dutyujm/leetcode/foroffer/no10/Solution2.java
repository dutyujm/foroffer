package cn.dutyujm.leetcode.foroffer.no10;

public class Solution2 {
    public int numWays(int n) {
        int a = 1;
        int b = 1;
        int sum =0 ;
        for (int i = 2; i <= n; i++) {
            sum = a+b % 1000000007;
            b = a;
            a = sum;
        }
        return sum;
    }

}
