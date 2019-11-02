package cn.dutyujm.no9;

import cn.dutyujm.no8.Solution;

public class no9 {
    public static void main(String[] args) {
        no9 solution = new no9();
        System.out.println(solution.JumpFloorII(5));
    }
    public int JumpFloorII(int target) {
        if(target<=1){
            return target;
        }
        return 2*JumpFloorII(target-1);
    }
}
