package cn.dutyujm.leetcode.no2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;

    }
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(0);
        listNode1.next.next= new ListNode(0);
        listNode1.next.next.next= new ListNode(0);
        listNode1.next.next.next.next= new ListNode(0);
        listNode1.next.next.next.next.next= new ListNode(0);
        listNode1.next.next.next.next.next.next= new ListNode(0);
        listNode1.next.next.next.next.next.next.next= new ListNode(0);
        listNode1.next.next.next.next.next.next.next.next= new ListNode(0);
        listNode1.next.next.next.next.next.next.next.next.next= new ListNode(0);
        listNode1.next.next.next.next.next.next.next.next.next.next= new ListNode(0);
        listNode1.next.next.next.next.next.next.next.next.next.next.next= new ListNode(0);
        listNode1.next.next.next.next.next.next.next.next.next.next.next.next= new ListNode(0);
        listNode1.next.next.next.next.next.next.next.next.next.next.next.next.next= new ListNode(0);
        listNode1.next.next.next.next.next.next.next.next.next.next.next.next.next.next= new ListNode(0);
        listNode1.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next= new ListNode(0);
        listNode1.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next= new ListNode(0);
        listNode1.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next= new ListNode(0);
        listNode1.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next= new ListNode(0);
        listNode1.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next= new ListNode(0);
        listNode1.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next= new ListNode(0);
        listNode1.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next= new ListNode(1);

        ListNode listNode2 = new ListNode(5);
        listNode2.next = new ListNode(6);
        listNode2.next.next= new ListNode(4);


        Solution solution = new Solution();
        System.out.println(solution.addTwoNumbers(listNode1, listNode2));
    }
}
