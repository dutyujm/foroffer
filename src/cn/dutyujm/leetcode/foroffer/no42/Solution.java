package cn.dutyujm.leetcode.foroffer.no42;

public class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int[] tmp = new int[nums.length];
        tmp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (tmp[i-1]<0){
                tmp[i] = nums[i];
            }else {
                tmp[i] = nums[i]+tmp[i-1];
            }
            res = Math.max(tmp[i],res);
        }
        return res;
    }
}
