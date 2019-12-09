package cn.dutyujm.offer.no12;
/**
 * @Author YuJunMing
 * @Date 2019/11/2 15:39
 * DESCRIPTION:给定一个double类型的浮点数base 和int类型的整数exponent。求base的exponent次方。保证base和exponent不同时为0
 */
public class Solution {
    public double Power(double base, int exponent) {
        double mul = 1.0;
        if(exponent>=0){
        for (int i = 0; i <exponent ; i++) {
            mul = mul*base;
        }
        }else if(exponent == 0 ) {
            return  mul;
        }else  if(exponent<0){
            for (int i = 0; i <(-1)*exponent ; i++) {
            mul = mul*(1.0/base);
            }
        }

        return  mul ;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.Power(2,-3)) ;

    }
}
