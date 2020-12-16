package cn.dutyujm.leetcode.no20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if (s.length()%2==1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar=='{'||aChar=='('||aChar=='[') {
                stack.push(aChar);
            }else {

                if (aChar=='}'&&!stack.empty()&&stack.peek()=='{') {
                    stack.pop();
                }else if (aChar==']'&&!stack.empty()&&stack.peek()=='[') {
                    stack.pop();
                }else if (aChar==')'&&!stack.empty()&&stack.peek()=='(') {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isValid("}{");
    }
}
