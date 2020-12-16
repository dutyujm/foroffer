package cn.dutyujm.leetcode.no35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len-1;
        int ans = len;
        while(left<=right) {
            int mid = ((right - left) /2 ) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
