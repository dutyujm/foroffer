package cn.dutyujm.test.baidu.no3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author yu
 * @Date 2020/3/29 20:26
 * @Version 1.0
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Tree> trees = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            trees.add(new Tree(in.nextInt(),i));
        }
        for (int i = 0; i < n-1; i++) {

        }
        
    }
    static class Tree{
        int weight;
        int num;
        ArrayList<Tree> trees;

        public Tree(int weight,int num) {
            this.weight = weight;
            this.trees = new ArrayList<>();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Tree)) {
                return false;
            }
            Tree tree = (Tree) o;
            return num == tree.num;
        }

        @Override
        public int hashCode() {
            return Objects.hash(num);
        }
    }
}
