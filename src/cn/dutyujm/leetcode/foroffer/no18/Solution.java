package cn.dutyujm.leetcode.foroffer.no18;

public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode tmpHead = head;
        ListNode pre = null;
        while (head!=null) {
            if (head.val == val){
                if (pre!=null){
                    pre.next = head.next;
                }else {
                    tmpHead = head.next;
                }
                break;
            }else {
                pre = head;
                head=head.next;
            }
        }
        return tmpHead;
    }
}
