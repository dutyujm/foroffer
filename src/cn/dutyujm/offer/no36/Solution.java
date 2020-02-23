package cn.dutyujm.offer.no36;

import javax.swing.text.Utilities;
import java.util.Objects;

/**
 * @Author YuJunMing
 * @Date 2020/2/10 14:07
 * DESCRIPTION: 输入两个链表，找出它们的第一个公共结点。
 */
public class Solution {
//    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
//        ListNode listNode1 = pHead1;
//        ListNode listNode2 = pHead2;
//        if (Objects.isNull(pHead1)||Objects.isNull(pHead2)) {
//            return null;
//        }
//        Integer length1 = 1;
//        Integer length2 = 1;
//        while (pHead1.next!=null){
//            pHead1=pHead1.next;
//            length1++;
//        }
//
//        while (pHead2.next!=null) {
//            pHead2=pHead2.next;
//            length2++;
//        }
//
//        if (length1>length2) {
//            for (int i = 0; i < length1-length2 ; i++) {
//                listNode1=listNode1.next;
//            }
//        }else {
//            for (int i = 0; i < length2-length1 ; i++) {
//                listNode2=listNode2.next;
//            }
//        }
//
//        while (listNode1!=listNode2) {
//            listNode1 = listNode1.next;
//            listNode2 = listNode2.next;
//            if (listNode1==listNode2) {
//                return listNode1;
//            }
//        }
//
//
//        return null;
//
//    }
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1 != p2) {
            p1 = p1 == null ? pHead2 : p1.next;
            p2 = p2 == null ? pHead1 : p2.next;
        }
        return p1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode pHead1  = null;
        ListNode pHead2  = null;
        ListNode pHead3 = new ListNode(1);
        pHead3.next = new ListNode(2);
        pHead3.next.next = new ListNode(3);
        pHead3.next.next.next = new ListNode(4);
        pHead3.next.next.next.next = new ListNode(5);

        System.out.println(solution.FindFirstCommonNode(solution.FindFirstCommonNode(pHead1, pHead2), pHead3).val);
    }
}