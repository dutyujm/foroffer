package cn.dutyujm.offer.no18;

/**
 public class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }
 */
/**
 * @Author YuJunMing
 * @Date 2019/11/28 10:45
 * DESCRIPTION:
 */
public class Solution  {

    public void Mirror(TreeNode root) {
        if (root==null){
            return;
        }
        Mirror(root.right);
        Mirror(root.left);

        TreeNode treeNode1 = root.left;
        root.left=root.right;
        root.right=treeNode1;
    }
}