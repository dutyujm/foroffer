package cn.dutyujm.offer.no29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author YuJunMing
 * @Date 2020/2/8 22:23
 * DESCRIPTION: 输入n个整数，找出其中最小的K个数。
 *              例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if (input.length == 0|| k <=0 || k>input.length) {
            return new ArrayList<>();
        }

        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            res.add(input[i]);
        }
        Collections.sort(res);

        for (int i = 0; i < k; i++) {
            arrayList.add(res.get(i));
        }
        return arrayList;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.GetLeastNumbers_Solution(new int[]{1, 2, 3, 45, 6, 3, 1, 3, 3, 76}, 5));
    }


}
