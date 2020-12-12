package cn.dutyujm.leetcode.no22;


public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast!= null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;

    }

    public static void main(String[] args) {

    }
}
