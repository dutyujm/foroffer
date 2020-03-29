package cn.dutyujm.leetcode.no1162;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * DESCRIPTION:
 * 你现在手里有一份大小为 N x N 的『地图』（网格） grid，上面的每个『区域』（单元格）都用 0 和 1 标记好了。
 * 其中 0 代表海洋，1 代表陆地，你知道距离陆地区域最远的海洋区域是是哪一个吗？请返回该海洋区域到离它最近的陆地区域的距离。
 *
 * 我们这里说的距离是『曼哈顿距离』（Manhattan Distance）：(x0, y0)和(x1, y1)这两个区域之间的距离是|x0 - x1| + |y0 - y1|。
 *
 * 如果我们的地图上只有陆地或者海洋，请返回 -1。
 */

public class Solution {
    public int maxDistance(int[][] grid) {
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        Queue<int[]> queue = new ArrayDeque<>();
        int m = grid.length;

        // 先把所有的陆地都入队。
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    queue.add(new int[] {i, j});
                }
            }
        }

        // 从各个陆地开始，一圈一圈的遍历海洋，最后遍历到的海洋就是离陆地最远的海洋。
        boolean hasOcean = false;
        int[] point = null;
        //循环条件，陆地不为空
        while (!queue.isEmpty()) {
            //取出一个陆地
            point = queue.poll();
            //获取陆地的x和y坐标
            int x = point[0];
            int y = point[1];
            // 取出队列的元素，将其四周的海洋入队。
            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                if (newX < 0 || newX >= m || newY < 0 || newY >= m || grid[newX][newY] != 0) {
                    continue;
                }
                grid[newX][newY] = grid[x][y] + 1; // 这里我直接修改了原数组，因此就不需要额外的数组来标志是否访问
                hasOcean = true;
                queue.add(new int[] {newX, newY});
            }
        }

        // 没有陆地或者没有海洋，返回-1。
        if (point == null || !hasOcean) {
            return -1;
        }

        // 返回最后一次遍历到的海洋的距离。
        return grid[point[0]][point[1]] - 1;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = new int[][] {{1,0,1},{0,0,0,},{1,0,1}};
        System.out.println(solution.maxDistance(arr));
    }
}
