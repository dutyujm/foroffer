package cn.dutyujm.no14;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
//输入一个链表，输出该链表中倒数第k个结点。

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        List<ListNode> tmp = new ArrayList<>();
        ListNode tmpHead = head;
        while (head != null){
            tmp.add(head);
            head = head.next;
        }
        if (k<tmp.size()&&k>0){
        return tmp.get(tmp.size()-k);
        }else if(k==tmp.size()){
            return tmpHead;
        }else if(k==0){
            return null ;
        }
        return null ;
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
        ListNode listNodeK = solution.FindKthToTail(listNode1,4);
        System.out.println(listNodeK.val);
    }
}