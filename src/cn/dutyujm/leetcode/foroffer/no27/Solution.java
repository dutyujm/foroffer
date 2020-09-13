package cn.dutyujm.leetcode.foroffer.no27;

public class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (null == root.left&&null==root.right){
            return root;
        }
        mirrorTree(root.left != null ? root.left : null);
        mirrorTree(root.right != null ? root.right : null);
        TreeNode tmpNode;
        tmpNode = root.left;
        root.left=root.right;
        root.right = tmpNode;
        return root;
    }


}
