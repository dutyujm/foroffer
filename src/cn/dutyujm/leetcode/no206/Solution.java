package cn.dutyujm.leetcode.no206;

import cn.dutyujm.leetcode.foroffer.no06.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode fast = head;
        ListNode slow = null;

        while (fast != null) {
            ListNode tmp = fast.next;
            fast.next = slow;
            slow = fast;
            fast = tmp;
        }

        return slow;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);
        Solution solution = new Solution();
        System.out.println(solution.reverseList(l));
    }
}
