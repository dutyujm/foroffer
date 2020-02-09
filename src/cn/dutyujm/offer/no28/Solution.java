package cn.dutyujm.offer.no28;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author YuJunMing
 * @Date 2020/2/8 22:10
 * DESCRIPTION:数 组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array.length == 0) {
            return 0;
        }
        int length = array.length;
        Map<Integer,Integer> map = new HashMap<>(8);
        for (int i = 0; i < length ; i++) {
            if (map.containsKey(array[i])) {

                map.replace(array[i],map.get(array[i])+1);
            } else {
                map.put(array[i],1);
            }
            if (map.get(array[i])*2 > length){
                return array[i];
            }

        }
        return 0;

    }

    public static void main(String[] args) {
        int [] array =  {1,1,1,1,1,4,77};
        Solution solution = new Solution();
        System.out.println(solution.MoreThanHalfNum_Solution(array));
    }
}
