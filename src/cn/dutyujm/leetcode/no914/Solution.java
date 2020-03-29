package cn.dutyujm.leetcode.no914;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author YuJunMing
 * @Date 2020/3/27 8:28
 * DESCRIPTION:
 * 给定一副牌，每张牌上都写着一个整数。
 * 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
 * 每组都有 X 张牌。
 * 组内所有的牌上都写着相同的整数。
 * 仅当你可选的 X >= 2 时返回 true。

 */
public class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] counts = new int[10000];
        for(int card : deck) {
            counts[card]++;
        }
        int gcd = counts[deck[0]];
        for(int cnt : counts) {
            if(cnt != 0) {
                gcd = getGCD(gcd, cnt);
                if(gcd < 2) {
                    return false;
                }
            }
        }

        return true;
    }
    public int getGCD(int a, int b) {
        return a % b == 0 ? b : getGCD(b, a % b);
    }


    public static void main(String[] args) {

    }
}
