package cn.dutyujm.leetcode.no09;

public class Solution {
    public static void main(String[] args) {
Solution solution =new Solution();
        System.out.println(solution.isPalindrome(121));
    }
    public boolean isPalindrome(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        boolean flag = true;
        for (int i = 0; i < chars.length/2; i++) {
            if (chars[i]!=chars[chars.length-i-1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
