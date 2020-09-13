package cn.dutyujm.leetcode.foroffer.no55;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int total = 1;
        total = total+Math.max(maxDepth(root.left),maxDepth(root.right));
        return total;
    }

}
