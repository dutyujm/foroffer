package cn.dutyujm.leetcode.no344;

public class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        int right = s.length-1;
        int left = 0;
        while (left<right) {
            char tmp = s[right];
            s[right] = s[left];
            s[left] = tmp;
            left++;
            right--;
        }

    }

    public static void main(String[] args) {

    }
}
