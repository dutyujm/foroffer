package cn.dutyujm.leetcode.foroffer.no59;

import java.util.LinkedList;
import java.util.Queue;

public class MaxQueue {
    Queue<Integer> queue;
    LinkedList<Integer> max;

    public MaxQueue() {
        this.queue = new LinkedList<>();
        this.max = new LinkedList<>();
    }

    public int max_value() {
        return max.size()==0?-1:max.getFirst();
    }

    public void push_back(int value) {
        queue.add(value);
        while(max.size()!=0&&max.getLast()<value){
            max.removeLast();
        }
        max.add(value);
    }

    public int pop_front() {
        if(max.size()!=0&&queue.peek().equals(max.getFirst()))
            max.removeFirst();
        return queue.size()==0?-1:queue.poll();
    }
}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */
