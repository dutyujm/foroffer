package cn.dutyujm.leetcode.foroffer.no32;

import java.util.Objects;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val &&
                left.equals(treeNode.left) &&
                right.equals(treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }
}