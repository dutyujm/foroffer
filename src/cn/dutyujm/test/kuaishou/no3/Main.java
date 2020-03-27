package cn.dutyujm.test.kuaishou.no3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String[] strings = string.split(",");

        ArrayList<String> integers = find(strings);

        if (integers.size()>0) {
            for (int i = 0; i < integers.size(); i++) {
                System.out.print(integers.get(i));
                if (i<integers.size()-1){
                    System.out.print(",");
                }
            }
        }else {
            System.out.println("null");
        }
    }

    public static ArrayList<String> find(String[] strings){
        ArrayList<String> beautiful = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            String tmp = strings[i];

            if (isBao(tmp)||isShun(tmp)){
                beautiful.add(tmp);
            }
        }
        Collections.sort(beautiful,(o1,o2)->{
            int flag1 = 0;
            int flag2 = 0;
            int val1 = 0;
            int val2= 0;
            if (isBao(o1)){
                char[] tmp = o1.toCharArray();
                int max = 1;
                for (int i = 3; i < 9; ) {
                    if (tmp[i]==tmp[i+1]&&tmp[i]==tmp[i+2]){
                        int temp =i+1;
                        while (tmp[i]==tmp[temp]){

                            max++;
                            if (temp+1<11){
                                temp++;
                            }else {
                                break;
                            }
                        }
                    }
                    i=i+max;
                }
                if (max>val1){
                    val1=max;
                    flag1=1;
                }
            }
            if (isShun(o1)){
                char[] tmp = o1.toCharArray();
                int max = 1;
                for (int i = 3; i < 9; ) {
                    if ((tmp[i]==tmp[i+1]+1&&tmp[i]==tmp[i+2]+2)){
                        int temp =i+1;
                        while (tmp[i]==tmp[temp]+(temp-i)){
                            max++;
                            if (temp+1<11){
                                temp++;
                            }else {
                                break;
                            }
                        }
                    }
                    i=i+max;
                }
                if (max>val1){
                    val1=max;
                    flag1=2;
                }
            }
            if (isShun(o1)){
                char[] tmp = o1.toCharArray();
                int max = 1;
                for (int i = 3; i < 9; ) {
                    if ((tmp[i]==tmp[i+1]-1&&tmp[i]==tmp[i+2]-2)){
                        int temp =i+1;
                        while (tmp[i]==tmp[temp]-(temp-i)){
                            max++;
                            if (temp+1<11){
                                temp++;
                            }else {
                                break;
                            }
                        }
                    }
                    i=i+max;
                }
                if (max>val1){
                    val1=max;
                    flag1=2;
                }
            }
            if (isShun(o2)){
                char[] tmp = o2.toCharArray();
                int max = 1;
                for (int i = 3; i < 9; ) {
                    if ((tmp[i]==tmp[i+1]+1&&tmp[i]==tmp[i+2]+2)){
                        int temp =i+1;
                        while (tmp[i]==tmp[temp]+(temp-i)){
                            max++;
                            if (temp+1<11){
                                temp++;
                            }else {
                                break;
                            }
                        }
                    }
                    i=i+max;
                }
                if (max>val2){
                    val2=max;
                    flag2=2;
                }
            }
            if (isShun(o2)){
                char[] tmp = o2.toCharArray();
                int max = 1;
                for (int i = 3; i < 9; ) {
                    if ((tmp[i]==tmp[i+1]-1&&tmp[i]==tmp[i+2]-2)){
                        int temp =i+1;
                        while (tmp[i]==tmp[temp]-(temp-i)){
                            max++;
                            if (temp+1<11){
                                temp++;
                            }else {
                                break;
                            }
                        }
                    }
                    i=i+max;
                }
                if (max>val2){
                    val2=max;
                    flag2=2;
                }
            }
            if (isBao(o2)){
                char[] tmp = o2.toCharArray();
                int max = 1;
                for (int i = 3; i < 9;) {
                    if (tmp[i]==tmp[i+1]&&tmp[i]==tmp[i+2]){
                        int temp =i+1;
                        while (tmp[i]==tmp[temp]){
                            max++;
                            if (temp+1<11){
                                temp++;
                            }else {
                                break;
                            }
                        }
                    }
                    i=i+max;
                }
                if (max>val2){
                    val2=max;
                    flag2=1;
                }
            }

            if (val1>val2){
                return -1;
            }else if (val1==val2&&flag1<flag2){
                return -1;
            }else {
                return 1;
            }

        });

        return beautiful;
    }

    public static boolean isBao(String s){
        char[] tmp = s.toCharArray();
        for (int i = 3; i < 9; i++) {
            if (tmp[i]==tmp[i+1]&&tmp[i]==tmp[i+2]){
                return true;
            }
        }
        return false;
    }
    public static boolean isShun(String s){
        char[] tmp = s.toCharArray();
        for (int i = 3; i < 9; i++) {
            if ((tmp[i]==tmp[i+1]-1&&tmp[i]==tmp[i+2]-2)||(tmp[i]==tmp[i+1]+1&&tmp[i]==tmp[i+2]+2)){
                return true;
            }
        }
        return false;
    }
}
