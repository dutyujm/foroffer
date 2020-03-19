package cn.dutyujm.leetcode.no1013;

/**
 * @Author YuJunMing
 * @Date 2020/3/11 17:16
 * DESCRIPTION:给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
 *
 * 形式上，如果可以找出索引 i+1 < j 且满足 (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1]) 就可以将数组三等分。

 */
public class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        if (A.length<0||A.length>50000) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum+=A[i];
        }
        if (sum%3!=0) {
            return false;
        }
        int part = sum/3;
        int right = A.length-1;
        int part01 = 0, part02 = 0, part03 = 0;

        int index = 0;
        while (index<right) {
            part01+=A[index++];
            if (part01 == part) {
                break;
            }
        }
        while (index<right) {
            part02+=A[index++];
            if (part02 == part) {
                break;
            }
        }
        if (part02==part01&&part01==part) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution =new Solution();
        int []a=  new int [] {0,2,1,-6,6,7,9,-1,2,0,1};
        System.out.println(solution.canThreePartsEqualSum(a));
    }
}
