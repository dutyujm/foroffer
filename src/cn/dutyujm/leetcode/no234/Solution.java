package cn.dutyujm.leetcode.no234;

import cn.dutyujm.leetcode.foroffer.no06.ListNode;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast!=null&&fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
//        slow是中间节点
        fast = slow;
        slow = null;
        while(fast!=null) {
            ListNode tmp = fast.next;
            fast.next = slow;
            slow = fast;
            fast = tmp;
        }
//        slow 是另一个的开始
        fast = head;

        while (slow!=null) {
            if (fast.val!=slow.val){
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
}
