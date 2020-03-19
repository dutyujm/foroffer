package cn.dutyujm.offer.no37;

/**
 * @Author YuJunMing
 * @Date 2020/2/25 15:23
 * DESCRIPTION: 统计一个数字在排序数组中出现的次数。
 */
public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        if (array.length==0) {
            return 0;
        }
        Integer num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==k) {
                for (int j = i; j < array.length ; j++) {
                    if (array[j]==k) {
                        num++;
                    }
                }
                break;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.GetNumberOfK(new int[]{1, 2, 3, 4, 4, 5}, 5));
    }
}
