package cn.dutyujm.leetcode.foroffer.no10;

public class Solution {
    public int fib(int n) {
        Long a = 1L;
        Long b = 1L;
        if (n<=0 ) {
            return 0;
        }
        if (n==1 || n==2) {
            return b.intValue();
        }
        Long res = 0L;
        for (int i = 3; i <= n; i++) {
            res = (a+b)%1000000007L;
            b = a;
            a = res;
        }
        return res.intValue();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.fib(95);
    }
}
