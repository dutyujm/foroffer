package cn.dutyujm.leetcode.foroffer.no4;

import javax.swing.*;

/**
 * @Author YuJunMing
 * @Date 2020/3/11 21:00
 * DESCRIPTION:在一个n*m的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 *              请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 0||cols == 0) {
            return false;
        }
        int x = rows - 1;
        int y = 0;
        while (x >= 0) {
            while (y < cols && matrix[x][y] < target) {
                y++;
            }
            if (y < cols && matrix[x][y] == target) {
                return true;
            }
            x--;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
