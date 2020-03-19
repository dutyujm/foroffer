package cn.dutyujm.leetcode.no414;

import java.util.TreeSet;

/**
 * @Author YuJunMing
 * @Date 2020/3/11 17:39
 * DESCRIPTION:给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 */
public class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : nums) {
            treeSet.add(num);
        }
        if (treeSet.size()>=3){
            treeSet.pollLast();
            treeSet.pollLast();
            return treeSet.pollLast();
        }else {
            return treeSet.pollLast();

        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int []a = new int [] {1,2,-2,3,3,4,5,5,4,54,5};
        System.out.println(solution.thirdMax(a));
    }
}
