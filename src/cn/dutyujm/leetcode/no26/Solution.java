package cn.dutyujm.leetcode.no26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int p = 0;
        for (int i = 0; i < len; i++) {
            if (nums[p]!=nums[i]) {
                p++;
                nums[p]=nums[i];
            }
        }
        return p+1;
    }

}
