package cn.dutyujm.leetcode.foroffer.no32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public int[] levelOrder(TreeNode root) {
        if (root==null) {
            return new int[0];
        }
        Stack<TreeNode> queue = new Stack<>();
        queue.add(root);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(!queue.isEmpty()) {
            TreeNode node = queue.pop();
            arrayList.add(node.val);
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }

        int[] arr =  new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            arr[i]=arrayList.get(i);
        }
        return arr;
    }


}
