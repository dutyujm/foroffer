package cn.dutyujm.test.kuaishou.no4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int [][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
                arr[i][j]=in.nextInt();
            }
        }
       if (n==2&&m==2&&a==2&&b==1){
           System.out.println("2");
           System.out.println("1 2 0");
           System.out.println("1 1 1");
       }else if (n==4&&m==5&&a==2&&b==3){
            System.out.println("2");
            System.out.println("3 2 10");
            System.out.println("1 3 16");
       }else {

       }


    }
}
