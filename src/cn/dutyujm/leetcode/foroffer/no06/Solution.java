package cn.dutyujm.leetcode.foroffer.no06;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class Solution {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head!= null) {
            stack.push(head.val);
            head = head.next;
        }
        int a [] = new int [stack.size()];
        for (int i = 0; i < a.length ; i++) {
            a[i] = stack.pop();
        }
        return a;
    }

    public static void main(String[] args) {
        Solution solution =  new Solution();

    }
}
