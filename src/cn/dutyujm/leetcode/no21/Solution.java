package cn.dutyujm.leetcode.no21;


import java.util.List;

public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode res = new ListNode();
        ListNode tmp = res;
        while (p1!=null&&p2!=null) {
            if (p1.val<p2.val) {
                res.next = p1;
                p1 = p1.next;
            }else {
                res.next = p2;
                p2 = p2.next;
            }
            res = res.next;

        }
        if (p1!=null) {
            res.next = p1;
        }else {
            res.next = p2;
        }
        return tmp;
    }
    public static void main(String[] args) {

    }
}
