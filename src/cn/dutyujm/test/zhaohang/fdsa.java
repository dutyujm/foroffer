package cn.dutyujm.test.zhaohang;

import java.util.*;

public class fdsa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int[] attack = new int[N];
        int[] protection = new int[N];
        ArrayList<Integer> chick = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            chick.add(in.nextInt());
        }
        for (int i = 0; i < N; i++) {
            attack[i] = in.nextInt();
            protection[i] = in.nextInt();
        }
        String res = "";
        for (int i = 0; i < N; i++) {
            if (attack[i]>chick.size()) {
                break;
            }else if (attack[i]!=protection[i]) {
                chick.remove(attack[i]-1);
                if (chick.size()<=1) {
                    break;
                }
            }
        }

        if (chick.size()<=1) {
            res+="Fail! ";
            res+=chick.get(0);
        }else {
            res+="Success! ";
            for (int i = chick.size()-1; i >= 0; i--) {
                res = res+ chick.get(i)+ " ";
            }
        }
        System.out.println(res);
    }
}
