package cn.dutyujm.leetcode.foroffer.no16;

public class Solution {
    public double myPow(double x, int n) {
        double a = 0;
        if (n==0){
            return 1;
        }
        if (n>0){
            if (n%2==0){
                a = myPow(x*x,n/2);
            }else {
                a = x*myPow(x*x,n/2);

            }
        }else {
            a = (1/x)*myPow(1/x,-n-1);

        }
        return a;
    }
}
