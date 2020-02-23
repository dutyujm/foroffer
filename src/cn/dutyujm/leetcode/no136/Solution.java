package cn.dutyujm.leetcode.no136;

import java.util.Arrays;
import java.util.Objects;

/**
 * @Author YuJunMing
 * @Date 2020/2/17 19:57
 * DESCRIPTION:给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i=i+2) {
            if (Objects.equals(i,nums.length-1)) {
                return nums[i];
            }
            if (nums[i]!=nums[i+1]) {
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}
