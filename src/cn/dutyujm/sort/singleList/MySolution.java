package cn.dutyujm.sort.singleList;

import cn.dutyujm.leetcode.foroffer.no06.ListNode;

public class MySolution {
    public ListNode sortInList (ListNode head) {
        if (head==null && head.next==null){
            return  head;
        }
        ListNode slow = head, fast = head.next;
        while (fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode newList = slow.next;
        slow.next = null;
        ListNode right = sortInList(newList);
        ListNode left = sortInList(head);
        ListNode lHead = new ListNode(-1);
        ListNode res = lHead;
        while (left!=null&&right!=null) {
            if (left.val>right.val) {
                lHead.next = left;
                left = left.next;
            }else {
                lHead.next = right;
                right = right.next;
            }
            lHead = lHead.next;
        }
        lHead.next = left!=null?left:right;
        return res.next;
    }
}
