package cn.dutyujm.leetcode.no40;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0) {
            return new int[0];
        }
        // 使用一个最大堆（大顶堆）
        // Java 的 PriorityQueue 默认是小顶堆，添加 comparator 参数使其变成最大堆
    Queue<Integer> head =new PriorityQueue<>((i1,i2)->Integer.compare(i2,i1));
        for (int i = 0; i < arr.length; i++) {
            if (head.isEmpty()||head.size()<k||head.peek()>arr[i]) {
                head.offer(arr[i]);
            }
            if (head.size()>k) {
                head.poll();
            }
        }
        int[] res = new int[k];
        int e = 0;
        for (Integer integer : head) {
            res[e++] = integer;

        }
return res;
    }

    public static void main(String[] args) {

    }
}
