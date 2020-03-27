package cn.dutyujm.meituan.no1;

/**
 * @Author YuJunMing
 * @Date 2020/3/12 19:02
 * DESCRIPTION:有一个2*n的网格，有一个人位于(1,1)的位置，即左上角，他希望从左上角走到右下角，即(2,n)的位置。
 *              在每一次，他可以进行三种操作中的一种：
 *
 * 1． 向右走一格，即从(x,y)到(x,y+1);
 *
 * 2． 向上右方走一格，即，如果他在(2,y)的位置可以走到(1,y+1);
 *
 * 3． 向下右方走一格，即，如果他在(1,y)的位置可以走到(2,y+1);
 *
 * 问题当然不会这么简单，在这2*n的格子中，有一部分格子上有障碍物，他不能停在障碍物上，当然也不能走出网格，
 * 请问他有多少种不同的路线可以到达(2,n)。
 *
 * 输入第一行仅包含一个正整数n，表示网格的长度。(1<=n<=50)
 * 接下来有2行,每行有n个字符，“X”代表障碍物，“.”代表可以停留。
 *
 */
public class Main {

    public static void main(String[] args) {

    }

}
