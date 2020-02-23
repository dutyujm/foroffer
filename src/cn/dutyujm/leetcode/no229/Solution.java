package cn.dutyujm.leetcode.no229;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author YuJunMing
 * @Date 2020/2/18 22:19
 * DESCRIPTION: 给定一个大小为 n 的数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
 */
public class Solution {
    public  List<Integer> majorityElement(int[] nums) {
        int length = nums.length;
        int half = length/3;
        List<Integer> list = new ArrayList<>();
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
                list.add(entry.getKey());
            }
        }

        return list;
    }

    public static void main(String[] args) {
        cn.dutyujm.leetcode.no169.Solution solution = new cn.dutyujm.leetcode.no169.Solution();
        System.out.println(solution.majorityElement(new int[]{3,3,4,4,5}));
    }
}
