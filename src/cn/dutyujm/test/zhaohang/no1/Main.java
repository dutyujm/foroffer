package cn.dutyujm.test.zhaohang.no1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        ArrayList<Sock> socks = new ArrayList<>(T);
        for (int i = 0; i < T; i++) {
            Sock sock = new Sock(in.nextInt());
            for (int j = 0; j < sock.getN(); j++) {
                sock.getIntegers().add(in.nextInt());
            }
            socks.add(sock);
        }

        for (Sock sock : socks) {
            ArrayList<Integer> integers = sock.getIntegers();
            Collections.sort(integers);
            int temp =-1;
            for (int i = 0; i < integers.size(); i++) {
                if (integers.get(i)>1) {
                    temp = i;
                    break;
                }
            }
            if (temp==-1){
                System.out.println(-1);
                continue;
            }
            int total = 0;
            for (int i = 0; i < temp; i++) {
                total+=integers.get(i);
            }
            total +=(sock.getN()-temp)+1;
            System.out.println(total);


        }

    }
    static class Sock {
        Integer n;
        ArrayList<Integer> integers = new ArrayList<>();

        public Sock(Integer n) {
            this.n = n;
        }

        public Integer getN() {
            return n;
        }

        public void setN(Integer n) {
            this.n = n;
        }

        public ArrayList<Integer> getIntegers() {
            return integers;
        }

        public void setIntegers(ArrayList<Integer> integers) {
            this.integers = integers;
        }

        @Override
        public String toString() {
            return "Sock{" +
                    "n=" + n +
                    ", integers=" + integers +
                    '}';
        }
    }
}

