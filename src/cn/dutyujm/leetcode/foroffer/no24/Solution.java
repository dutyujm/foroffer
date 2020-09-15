package cn.dutyujm.leetcode.foroffer.no24;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode right = null;
        ListNode left = head;
        while (left!=null){
            ListNode tmp = left;
            left = left.next;
            tmp.next = right;
            right = tmp;
        }

        return right;
    }
}
