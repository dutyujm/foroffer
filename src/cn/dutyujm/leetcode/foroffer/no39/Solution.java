package cn.dutyujm.leetcode.foroffer.no39;


import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        int res = 0;
        for (int num : nums) {
            m.merge(num, 1, Integer::sum);
            if (m.get(num)>nums.length/2) {
                res = num;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,5,4,6,7};
        Solution solution = new Solution();
        solution.majorityElement(a);

    }
}
