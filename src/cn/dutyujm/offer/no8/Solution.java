package cn.dutyujm.offer.no8;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.JumpFloor(5));
    }
    public int JumpFloor(int target) {
        if(target <= 2){
            return target;
        }
        int pre2 = 1;
        int pre1 = 2;

        for (int i = 3; i <= target; i++){
            pre1 = pre2+pre1;
            pre2 =pre1-pre2;
        }
        return pre1;
    }
}
