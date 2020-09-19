package cn.dutyujm.leetcode.foroffer.no59;

public class Solution {
    public  int[] maxSlidingWindow(int[] nums,int k) {
        int[] maxNums = new int[nums.length-k+1];
        for (int i = 0; i < nums.length-k+1; i++) {
            int maxNum = Integer.MIN_VALUE;
            for (int j = 0; j < k; j++) {
                if (nums[i+j]>maxNum) {
                    maxNum = nums[i+j];
                }
            }
            maxNums[i] = maxNum;
        }
        return maxNums;
    }
}
