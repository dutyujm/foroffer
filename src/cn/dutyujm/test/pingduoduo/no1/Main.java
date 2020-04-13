package cn.dutyujm.test.pingduoduo.no1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @ClassName Main
 * @Description 第一次拼团活动后，多多鸡收到了用户非常不错的反馈。
 * 于是，多多鸡又准备举办第二次优惠活动， 这次的规则是:买三送一-!
 * 即每购买3个商品，免费赠送其中价格最低的一个。
 * 皮皮虾现在打算购买N个商品(编号1~N)口，其中第1个商品的价格为Ai。
 * 现在皮皮虾需要你帮忙找到一种购买策略，使得能够花费最少的钱买到所有商品。
 * @Author yu
 * @Date 2020/4/10 19:12
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Long> integers = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            integers.add(in.nextLong());
        }
        System.out.println(Solution(integers));
    }


    public static Long Solution(ArrayList<Long> integers){
        int n = integers.size();

        Collections.sort(integers);
        Long sum = 0L ;
        Long total = 0L;

        for (int i = 0; i < n; i++) {
            total+=integers.get(i);
        }
        if (n<0){
            return 0L;
        }
        if (n<=2){
            return total;
        }
        for (int i = n-3; i >= 0; i=i-3) {
            sum+=integers.get(i);
        }
        return total-sum;
    }
}
