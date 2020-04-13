package cn.dutyujm.test.tx;

/**
 * @ClassName Node
 * @Description TODO
 * @Author yu
 * @Date 2020/3/31 15:35
 * @Version 1.0
 */
public class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
