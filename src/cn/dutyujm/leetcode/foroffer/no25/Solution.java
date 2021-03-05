package cn.dutyujm.leetcode.foroffer.no25;

public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode head = res;
        while (l1!=null&& l2!=null) {
            if (l1.val < l2.val) {
                res.next = l1;
                l1 = l1.next;
            }else {
                res.next = l2;
                l2 = l2.next;
            }
            res = res.next;
        }
        res.next = l1!=null?l1:l2;
        return head.next;

    }
}
