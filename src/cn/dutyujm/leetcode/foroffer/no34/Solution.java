package cn.dutyujm.leetcode.foroffer.no34;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(root, sum, 0, new ArrayList<>(), result);
        return result;
    }
    public void dfs(TreeNode root, int sum, int toal, ArrayList<Integer> list,
                    List<List<Integer>> result) {
        if (root == null)
            return;
        list.add(root.val);
        toal += root.val;
        if (root.left == null && root.right == null) {
            if (sum == toal){
                result.add(list);
            }
            list.remove(list.size() - 1);
            return;
        }
        dfs(root.left, sum, toal, list, result);
        dfs(root.right, sum, toal, list, result);
        list.remove(list.size() - 1);
    }
}
