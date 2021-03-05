package cn.dutyujm.interview;

public class Solution {
    public static void main(String[] args) {
        int[][]arr = new int[][]{
                {1,100,100,100,100,100,80,90,90,19},
                {1,1,100,100,100,100,80,90,90,19},
                {100,1,1,1,1,1,1,1,90,19},
                {100,100,100,100,1,100,80,90,90,19},
                {100,100,100,100,1,100,80,90,90,19},
                {100,1,1,1,1,100,80,90,90,19},
                {100,1,100,100,100,100,80,90,90,19},
                {100,1,1,1,100,100,80,90,90,19},
                {100,1,1,100,100,100,80,90,90,19},
                {100,1,1,1,1,1,1,1,1,19},
        };
    }
    private static int minCostPathVal(int[][] arr) {
        int len = 10;
        int[][] dp =new int[len+1][len+1];
        dp[0][0] = arr[0][0];
        for (int i = 1; i < len; i++) {
            dp[i][0] = dp[i-1][0] + arr[i][0];
        }
        for (int i = 1; i < len; i++) {
            dp[0][i] = dp[0][i-1] + arr[0][i];
        }
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len; j++) {
                dp[i][j] = Math.min(dp[i-1][j] ,dp[i][j-1] )+arr[i][j];
            }
        }
        return dp[10][10];

    }


}
