package cn.dutyujm.offer.no7;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.Fibonacci(6));
    }
    public int Fibonacci(int n) {
        if(n<1||n==1){
            return n;
        }
        int sum=1 ;
        int one=0;
        for (int i =2 ;i<=n;i++){
            sum = sum + one;
            one = sum - one;
        }
        return sum;

    }
}
