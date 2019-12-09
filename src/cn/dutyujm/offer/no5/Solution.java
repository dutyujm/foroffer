package cn.dutyujm.offer.no5;
/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public static void main(String[] args) {
        Solution solution =new Solution();
        solution.push(1);
        solution.push(2);
        solution.push(3);
        System.out.println(solution.pop());
        System.out.println(solution.pop());
        solution.push(4);
        System.out.println(solution.pop());
        solution.push(5);
        System.out.println(solution.pop());
        System.out.println(solution.pop());


    }
    public void push(int node) {
        stack1.push(node);

    }

    public int pop() {
        stack2.empty();
        int tmpSize = stack1.size();

        for(int i=0;i<tmpSize;i++){
              stack2.push(stack1.pop());
        }
        int tmpNum = stack2.pop();

        for(int i=0;i<tmpSize-1;i++){
            stack1.push(stack2.pop());
        }

        return tmpNum;
    }
}