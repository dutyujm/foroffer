package cn.dutyujm.offer.no24;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Author YuJunMing
 * @Date 2020/1/30 15:06
 * DESCRIPTION:输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 *              路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class Solution {

    private ArrayList<ArrayList<Integer>> paths = new ArrayList<>();

    private Stack<Integer> path = new Stack();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

        if (root == null) {
            return new ArrayList<>();
        }
        find(root,target,0);
        return paths;
    }

    private void find(TreeNode root,int target,int total) {

        if (target == total &&  root==null ) {
            paths.add(new ArrayList<>(path));
            return;
        }
        if (root == null) {
            return;
        }


        path.push(root.val);
        find(root.left,target, total +root.val);
        path.pop();

        if (root.left == null && root.right == null) {
            return;
        }

        path.push(root.val);
        find(root.right,target,total+root.val);
        path.pop();

    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        Solution solution = new Solution();
        System.out.println(solution.FindPath(root, 7));
    }
}
