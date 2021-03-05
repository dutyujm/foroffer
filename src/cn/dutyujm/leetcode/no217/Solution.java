package cn.dutyujm.leetcode.no217;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>(nums.length);
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        for (Integer integer : map.keySet()) {
            if (map.get(integer)>1) {
                return true;
            }
        }
        return false;

    }

}
