package cn.dutyujm.offer.no22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
/**
 * @Author YuJunMing
 * @Date 2020/1/30 14:40
 * DESCRIPTION:从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class Solution {
    public static void main(String[] args) {
        TreeNode treeNode = null;
        Solution solution = new Solution();

        ArrayList<Integer> arrayList = solution.PrintFromTopToBottom(treeNode);
        System.out.println(arrayList);
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        if(root == null ) {
            return arrayList;
        }
        arrayList.add(root.val);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2 = abc(root);
        arrayList.addAll(arrayList2);
        return arrayList;
    }



    public ArrayList<Integer> abc(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(root == null) {
            return arrayList;
        }


        if (root.left != null) {
            arrayList.add(root.left.val);
        }
        if (root.right != null) {
            arrayList.add(root.right.val);
        }
        if (root.left != null) {
            arrayList.addAll(abc(root.left));
        }
        if (root.right != null) {
            arrayList.addAll(abc(root.right));
        }

        return arrayList;
    }
}
