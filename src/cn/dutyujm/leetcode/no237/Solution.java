package cn.dutyujm.leetcode.no237;

import cn.dutyujm.leetcode.foroffer.no06.ListNode;

public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
