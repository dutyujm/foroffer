package cn.dutyujm.leetcode.no169;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author YuJunMing
 * @Date 2020/2/18 21:10
 * DESCRIPTION: 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *              你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int length = nums.length;
        int half = length/2;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.replace(nums[i],hashMap.get(nums[i])+1);
            }else {
                hashMap.put(nums[i],1);
            }
        }


        for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()) {
            if (entry.getValue()>half) {
                return entry.getKey();
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.majorityElement(new int[]{1, 3, 34, 3, 4, 3, 3, 3, 3, 3, 3, 4, 23}));
    }
}
