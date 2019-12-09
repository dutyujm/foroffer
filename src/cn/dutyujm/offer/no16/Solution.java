package cn.dutyujm.offer.no16;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
//输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
            ListNode tmpList1 = list1;
            ListNode tmpList2 = list2;
            ListNode tmp = new ListNode(0);
            ListNode tmp2 = tmp;
            while(list1!=null&&list2!=null){
                if(list1.val>list2.val){
                    tmp.next = new ListNode(list2.val);
                    tmp = tmp.next;
                    list2 = list2.next;
                }else {
                    tmp.next = new ListNode(list1.val);
                    tmp = tmp.next;
                    list1 = list1.next;
                }
            }

            if (list1==null){
                tmp.next=list2;

            }else if(list2==null){
                tmp.next =list1;
            }

        return tmp2.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode1=new ListNode(1) ;
        ListNode listNode2 =new ListNode(3) ;
        ListNode listNode3 =new ListNode(5) ;
        listNode2.next=listNode3;
        listNode1.next=listNode2;

        ListNode listNode4=new ListNode(2) ;
        ListNode listNode5 =new ListNode(4) ;
        ListNode listNode6 =new ListNode(6) ;
        listNode5.next=listNode6;
        listNode4.next=listNode5;

       ListNode end =  solution.Merge(listNode1,listNode4);
        for (int i = 0; i <6 ; i++) {
            System.out.println(end.val);
            end=end.next;
        }
    }
}