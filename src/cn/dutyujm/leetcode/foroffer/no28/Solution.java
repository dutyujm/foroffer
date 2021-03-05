package cn.dutyujm.leetcode.foroffer.no28;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return recur(root.left, root.right);
    }
    public boolean recur(TreeNode left,TreeNode right){
       if (left == null && right == null) {
           return true;
       }
       if (left!=null || right!= null) {
           return false;
       }
       if (left.val != right.val) {
           return false;
       }
       return recur(left.right,right.left)&&recur(right.left,left.right);
    }
}
