package cn.dutyujm.test.pingduoduo.no3;

import java.util.Scanner;

/**
 * @ClassName Main
 * @Description
 * 最近新出了一种彩票，玩法是选择N个十进制数字(0-9)，并且选择的数字中存在一个数
 * 字至少有K个。这N个数字的选择是有序的，即选择[1,2, 3]和[3,2,1]是不一样的。多
 * 多有自己特殊的选号技巧，他写了一个程序生成了他觉得能中大奖的「幸运号码」。但多
 * 多的幸运号码可能不满足彩票的规则一存在一 个数字至少有 K个。所以多多需要再将生
 * 成的幸运号码进行一些小修改， 让其符合要求。多多认为将幸运号码中的一个数字x改成
 * y会损失|x-yl(|x|表示x的绝对值)的幸运值。现在多多需要实现一个程序:输入是生成
 * 的幸运号码，输出是幸运值损失最小的合法彩票号码及其损失的幸运值。
 * @Author yu
 * @Date 2020/4/10 19:54
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        char[] chars = in.next().toCharArray();
        int[] ints =new int[N];
        for (int i = 0; i < N; i++) {
            ints[i] = chars[i]-'0';
        }

    }

}
