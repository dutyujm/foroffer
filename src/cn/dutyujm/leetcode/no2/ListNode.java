package cn.dutyujm.leetcode.no2;

public class ListNode {

    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return  val +
                "," + next;
    }
}
