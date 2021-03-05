package cn.dutyujm.leetcode.foroffer.no52;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cur1 = headA;
        ListNode cur2 = headB;
        while (cur1!=cur2) {
            if (cur1 == null) {
                cur1 = headB;
            }else {
                cur1 = cur1.next;
            }
            if (cur2 == null) {
                cur2 = headB;
            }else {
                cur2 = cur2.next;
            }
        }
        return cur1;
    }
}
