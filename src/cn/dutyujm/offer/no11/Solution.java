package cn.dutyujm.offer.no11;
//输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.NumberOf1(-5));

    }
    public int NumberOf1(int n) {
        int total = 0;
        String s = Integer.toBinaryString(n);
        for(int i = 0; i <s.length(); i++) {
            if(s.charAt(i)=='1'){
                total++;
            }
        }
        return total;
    }
}
