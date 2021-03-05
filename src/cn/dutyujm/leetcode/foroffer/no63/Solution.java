package cn.dutyujm.leetcode.foroffer.no63;

public class Solution {
    public int maxProfit(int[] prices) {
        int[] minPrices = new int[prices.length];
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            min = minPrices[i] = Math.min(prices[i],min);
        }
        for (int i = 0; i < prices.length; i++) {
            profit = Math.max(profit,prices[i]-minPrices[i]);
        }
        return profit;
    }
}
