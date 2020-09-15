package cn.dutyujm.leetcode.foroffer.no06;

import java.util.*;

public class Solution {
    public int[] reversePrint(ListNode head) {

        LinkedList<ListNode> nodes = new LinkedList<>();

        ListNode nodeHead = head;
        while(head!= null) {
            nodes.add(head);
            head = head.next;
        }
        int[] a = new int [nodes.size()];

        for (int i = 0; i < a.length; i++) {
            a[i] = nodes.removeLast().val;
        }
        return a;
    }

    public static void main(String[] args) {
        Solution solution =  new Solution();

    }
}
