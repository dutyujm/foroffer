package cn.dutyujm.test.tx;

import java.util.Objects;
import java.util.Stack;

/**
 * @ClassName Main
 * @Description TODO
 * @Author yu
 * @Date 2020/3/31 15:34
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        System.out.println(niXu(node));
    }
    public static Node niXu(Node node){
        Stack<Integer> integers = new Stack<>();
        while (node.next!=null) {
            integers.push(node.val);
            node = node.next;
        }

        while (!integers.isEmpty()) {
            node.next = new Node(integers.pop());
        }

//        while (node.next!=null) {
//            nodeStack.push(node);
//            node = node.next;
//            nodeStack.peek().next = null;
//        }
//        Node res = node;
//        while (!nodeStack.empty()) {
//            res.next = nodeStack.pop();
//        }
        return node;
    }

}
