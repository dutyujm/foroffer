package cn.dutyujm.leetcode.no137;

import java.util.Arrays;
import java.util.Objects;

public class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i=i+3) {
            if (Objects.equals(i,nums.length-1)) {
                return nums[i];
            }
            if (nums[i]!=nums[i+1]) {
                return nums[i];
            }
        }
        return 0;
    }
}
