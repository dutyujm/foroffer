package cn.dutyujm.test;

import cn.dutyujm.leetcode.foroffer.no36.Node;
import cn.dutyujm.shejimoshi.singleton.MeiJu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        Node node = new Node(1);

        node.left = new Node(2);
        node.left.left = new Node(4);
        node.left.right = new Node(5);

//        node.right = new Node(3);
//        node.right.left = new Node(6);
//        node.right.right = new Node(7);
        Integer[] preArr = new Integer[]{1,2,4,5,3,6,7};
        Arrays.sort(preArr,(i1,i2)-> i2-i1);

        ArrayList<Integer> pre = new ArrayList<>(Arrays.asList(preArr));
        Integer[] inArr = new Integer[]{4,2,5,1,6,3,7};
        ArrayList<Integer> in = new ArrayList<>(Arrays.asList(inArr));

        System.out.println(fuyuan(pre,in));
        System.out.println(" ");
        in(fuyuan(pre,in));

        System.out.println(pingheng(node));
    }


    private static void in(Node node) {
        if (node==null) {
            return;
        }
        in(node.left);
        System.out.print(node.val+" ");
        in(node.right);
    }

    private static void pre(Node node) {
        if (node==null) {
            return;
        }
        System.out.print(node.val+" ");
        pre(node.left);
        pre(node.right);
    }

    private static void hou(Node node) {
        if (node==null) {
            return;
        }
        hou(node.left);
        hou(node.right);
        System.out.print(node.val+" ");
    }


    private static Node fuyuan(List<Integer> pre, List<Integer> in) {

        int Len = pre.size();

        if (Len == 0  || pre.size()!=in.size()) {
            return null;
        }
        Node res = new Node(pre.get(0));
        int mid = Len /2;
        res.left =  fuyuan(pre.subList(1,mid+1),in.subList(0,mid));
        res.right = fuyuan(pre.subList(mid+1,Len),in.subList(mid+1,Len));

        return res;
    }

    private static boolean pingheng(Node node) {
        int high = high(node.left);
        int high1 = high(node.right);
        return Math.abs(high - high1) <= 1;
    }

    private static int high(Node node) {
        if (node == null) {
            return 0;
        }
        int leftHigh = high(node.left);
        int rightHigh = high(node.right);
        return 1+Math.max(leftHigh, rightHigh);
    }
}




