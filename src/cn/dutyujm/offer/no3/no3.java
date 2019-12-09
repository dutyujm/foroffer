package cn.dutyujm.offer.no3;

import java.util.ArrayList;

public  class no3 {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if (listNode != null) {

            while (listNode!= null) {
                arrayList.add(0, listNode.val);
                listNode = listNode.next;
            }


        }
        return arrayList;
    }
}
