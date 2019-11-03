package cn.dutyujm.no15;


import java.util.ArrayList;
import java.util.List;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
//输入一个链表，反转链表后，输出新链表的表头。
public class Solution {

    public ListNode ReverseList(ListNode head) {
        if(head != null){
        List<ListNode> tmp = new ArrayList<>();
        while (head != null){
            tmp.add(new ListNode(head.val));
            head = head.next;
        }
        for (int i = tmp.size()-1; i >0; i--) {
            tmp.get(i).next=tmp.get(i-1);
        }
        return tmp.get( tmp.size()-1);
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode1=new ListNode(1) ;
        ListNode listNode2 =new ListNode(2) ;
        ListNode listNode3 =new ListNode(3) ;
        ListNode listNode4 =new ListNode(4) ;
        listNode3.next=listNode4;
        listNode2.next=listNode3;
        listNode1.next=listNode2;
        ListNode listNodeK = solution.ReverseList(listNode1);

    }
}
