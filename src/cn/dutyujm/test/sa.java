package cn.dutyujm.test;
import java.util.ArrayList;
import java.util.Scanner;

public class sa {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            ArrayList<String> proxy = new ArrayList<>();
            for (int i = 0; i < n ; i++) {
                proxy.add(in.next());
            }

            int m = in.nextInt();
            ArrayList<String> target = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                target.add(in.next());
            }

            System.out.println(fuck(proxy, target));
        }
        public static int fuck(ArrayList<String> proxy,ArrayList<String> target) {

            return 0;
        }

}
