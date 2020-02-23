package cn.dutyujm.leetcode.no260;

import cn.dutyujm.javalearn.Collection.Person;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author YuJunMing
 * @Date 2020/2/17 20:11
 * DESCRIPTION: 给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。
 *              找出只出现一次的那两个元素。
 */
public class Solution {
    public int[] singleNumber(int[] nums) {
//        HashMap<Integer,Integer> hashMap = new HashMap();
//        for (int i = 0; i < nums.length; i++) {
//            if (hashMap.containsKey(nums[i])) {
//                hashMap.replace(nums[i],hashMap.get(nums[i])+1);
//            }else {
//                hashMap.put(nums[i],1);
//            }
//        }
//        int [] res = new int[2];
//        int i = 0;
//        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()) {
//            if (entry.getValue().equals(1)) {
//                res[i]=entry.getKey();
//            }
//        }
//        return res;
        int diff = 0;
        for (int num : nums) {
            diff ^= num;
        }
        diff = diff & -diff;
        int[] ret = new int[2];
        for (int num : nums) {
            if ((num & diff) == 0) {
                ret[0] ^= num;
            } else {
                ret[1] ^= num;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.singleNumber(new int[]{1, 2, 1, 3, 2, 5})));
    }
}
