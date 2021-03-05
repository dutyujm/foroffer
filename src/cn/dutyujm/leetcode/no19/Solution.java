package cn.dutyujm.leetcode.no19;

import java.util.List;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp = new ListNode(0);
        tmp.next = head;
        ListNode fast = head;
        ListNode slow = tmp;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast!=null) {
            fast = fast.next;
            slow = slow.next;
        }
//        slow是倒数第K个
        slow.next = slow.next.next;
        return tmp.next;
    }
}
