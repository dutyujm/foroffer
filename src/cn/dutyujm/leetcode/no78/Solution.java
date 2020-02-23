package cn.dutyujm.leetcode.no78;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author YuJunMing
 * @Date 2020/2/17 20:28
 * DESCRIPTION: 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 */
public class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (Integer n : nums) {
            int size = res.size();
            for (int i = 0; i < size; i++) {
                List<Integer> newSub = new ArrayList<Integer>(res.get(i));
                newSub.add(n);
                res.add(newSub);
            }
        }
        return res;

    }
}
