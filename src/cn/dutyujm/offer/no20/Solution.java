package cn.dutyujm.offer.no20;
import java.util.Objects;
import java.util.Stack;

public class Solution {

    private  static Stack<Integer> stack = new Stack<>();
    private static Stack<Integer> minValue  = new Stack<>();


    public void push(int node) {


        if (this.min()>=node){
            minValue.push(node);
        }else if (stack.empty()){
            minValue.push(node);
        }

        stack.push(node);
    }

    public void pop() {
        Integer tmp = stack.pop();
        if (Objects.equals(this.min(),tmp)){
            minValue.pop();
        }

    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        if (!minValue.empty()){
            return minValue.peek();
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.push(3);
        System.out.println(Solution.stack);
        System.out.println(Solution.minValue);
        System.out.println(solution.top()+"   "+solution.min());
        solution.push(5);
        System.out.println(Solution.stack);
        System.out.println(Solution.minValue);
        System.out.println(solution.top()+"   "+solution.min());
        solution.push(3);
        System.out.println(Solution.stack);
        System.out.println(Solution.minValue);
        System.out.println(solution.top()+"   "+solution.min());
        solution.push(6);
        System.out.println(Solution.stack);
        System.out.println(Solution.minValue);
        System.out.println(solution.top()+"   "+solution.min());
        solution.push(1);
        System.out.println(Solution.stack);
        System.out.println(Solution.minValue);
        System.out.println(solution.top()+"   "+solution.min());
    }
}
