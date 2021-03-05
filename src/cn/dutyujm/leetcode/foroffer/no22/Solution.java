package cn.dutyujm.leetcode.foroffer.no22;


public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null){
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        for (int i = 0; i < k; i++) {
            first = first.next;
        }
        while (first!=null){
            first = first.next;
            second = second.next;
        }
        return second;
    }
}
