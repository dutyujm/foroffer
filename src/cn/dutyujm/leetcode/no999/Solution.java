package cn.dutyujm.leetcode.no999;

import java.util.Scanner;

/**
 * @Date 2020/3/26 8:51
 * DESCRIPTION: 在一个 8 x 8 的棋盘上，有一个白色车（rook）。也可能有空方块，白色的象（bishop）和黑色的卒（pawn）。
 *              它们分别以字符 “R”，“.”，“B” 和 “p” 给出。大写字符表示白棋，小写字符表示黑棋。
 *
 *              车按国际象棋中的规则移动：它选择四个基本方向中的一个（北，东，西和南），然后朝那个方向移动，直到它选择停止、
 *              到达棋盘的边缘或移动到同一方格来捕获该方格上颜色相反的卒。另外，车不能与其他友方（白色）象进入同一个方格。
 *
 *              返回车能够在一次移动中捕获到的卒的数量。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.numRookCaptures(new char[1][1]);
    }
    public int numRookCaptures(char[][] board) {

        int x = 0;
        int y = 0;
        int res = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                }
            }
        }

        for (int i = x; i < 8; i++) {
            if (board[i][y] == 'p') {
                res++;
                break;
            }else if (board[i][y] == 'B'){
                break;
            }
        }

        for (int i = x; i >=0; i--) {
            if (board[i][y] == 'p') {
                res++;
                break;
            }else if (board[i][y] == 'B'){
                break;
            }
        }

        for (int i = y; i < 8; i++) {
            if (board[x][i] == 'p') {
                res++;
                break;
            }else if (board[x][i] == 'B'){
                break;
            }
        }

        for (int i = y; i >=0; i--) {
            if (board[x][i] == 'p') {
                res++;
                break;
            }else if (board[x][i] == 'B'){
                break;
            }
        }
        return res;
    }
}
