package cn.dutyujm.test.kuaishou.no1;

public class Solution {
    /**
     * 获取队中从前到后每个人与前方身高高于自己的人的最短距离
     * @param height int整型一维数组 队中从前到后每个人与前方身高高于自己的人的最短距离
     * @return int整型一维数组
     */
    public int[] DistanceToHigher (int[] height) {
        // write code here
        int[] res = new int[height.length];
        for (int i = 0; i < height.length; i++) {
            int tmp = height[i];
            for (int j = i-1; j >=0 ; j--) {
                if (height[j]>tmp) {
                    res[i] = i-j;
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] a = new int[]{175,173,174,163,182,177};
        int[] b = solution.DistanceToHigher(a);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
