package cn.dutyujm.leetcode.foroffer.no36;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue=new LinkedList<>();
        queue = dfs(root,queue);
        Node head = queue.remove();
        Node tail = head;

        while (!queue.isEmpty()) {
            tail.right = queue.remove();
            tail.right.left = tail;
            tail = tail.right;
        }
        tail.right = head;
        head.left = tail;
        return head;
    }

    public Queue<Node> dfs(Node root,Queue<Node> queue) {
        if (root == null) {
            return null;
        }
        dfs(root.left,queue);
        queue.add(root);
        dfs(root.right,queue);
        return queue;
    }
}
