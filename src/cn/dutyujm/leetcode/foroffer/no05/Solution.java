package cn.dutyujm.leetcode.foroffer.no05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public String replaceSpace(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        char [] a = s.toCharArray();

        for (int i = 0; i < a.length ; i++) {
            if (a[i]==' ') {
                stringBuffer.append("%20");
            }else {
                stringBuffer.append(a[i]);
            }
        }

        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.replaceSpace("we are the world "));

    }
}
