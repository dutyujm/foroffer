package cn.dutyujm.leetcode.no41;

public class Solution {
    public static int firstMissingPositive(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<=0) {
                nums[i] = len+1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            if (num<=len) {
                nums[num-1] = -Math.abs(nums[num-1]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return i+1;
            }
        }
        return len+1;
    }

    public static void main(String[] args) {

        int[] arr= new int[]{};
        firstMissingPositive(arr);
    }
}
