package cn.dutyujm.leetcode.foroffer.no14;

public class Solution {
    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i; j++) { // 这里循环拆解i，dp[i]会一直刷新；dp[i]其实可以初始化为i，但没必要。相乘后肯定比i大，所以可以默认为0
                dp[i] = Math.max(dp[i],Math.max(j * (i - j),j * dp[i - j]));
            }
        }
        return dp[n];

    }
}
