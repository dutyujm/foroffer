package cn.dutyujm.offer.no32;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Supplier;

/**
 * @Author YuJunMing
 * @Date 2020/2/9 11:09
 * DESCRIPTION: 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 *              例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
public class Solution {


    public String PrintMinNumber(int [] numbers) {
        if(numbers == null || numbers.length == 0) {
            return "";
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int number : numbers) {
            arrayList.add(number);
        }
        arrayList.sort((o1,o2)-> {
            int sum1 = Integer.valueOf(o1+""+o2);
            int sum2 = Integer.valueOf(o2+""+o1);
            if(sum1 > sum2){
                return 1;
            }else {
                return -1;
            }
        });
        String res = "";
        for (Integer integer : arrayList) {
            res+=integer;
        }
       return res;

    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.PrintMinNumber(new int[]{1, 2, 34, 5, 34, 23, 2}));
    }
}