package cn.dutyujm.offer.no13;
/**
 * @Author YuJunMing
 * @Date 2019/11/2 15:54
 * DESCRIPTION:输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Solution {
    public static void main(String[] args) {
        int []a = {1,2,3,4,5,8,6,7,9};
        Solution solution = new Solution();
        solution.reOrderArray(a);
    }

    public void reOrderArray(int [] array) {
        int length = array.length;

        for (int i = length-1; i >=0 ; i--) {

            if(array[i]%2==0){
                int j = i;

                while ((j<(length-1)&&array[j+1]%2==1)||(j<(length-1)&&array[j+1]<array[j])){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    j++;
                }
            }
        }
        for (int i = 0; i <length ; i++) {
            System.out.println(array[i]);
        }


    }




}
