package cn.dutyujm.leetcode.foroffer.no48;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

    }
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int tmp = 0;
        for(int j = 0; j < s.length(); j++) {
            int i = j - 1;
            while(i >= 0 && s.charAt(i) != s.charAt(j)) {
                i--; // 线性查找 i
            }
            if (tmp < j - i) {
                tmp ++;
            }else {
                tmp = j-i;
            }
            res = Math.max(res, tmp); // max(dp[j - 1], dp[j])
        }
        return res;
    }

}
