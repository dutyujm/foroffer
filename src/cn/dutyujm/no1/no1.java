package cn.dutyujm.no1;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class no1 {
    public static void main(String[] args) {
        no1 test = new no1();

        int[][] c = new int[][]{{1,2,8,9},{4,7,10,13}};
        int [][]d = new int [][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int[][] e = new int [1][1];

        System.out.println(test.Find(15,e));


    }

    public boolean Find(int target, int [][] array) {
        int arrHigh = array.length;  //行数2
        int arrLength = array[0].length; //列数4
        if(arrLength>0 && arrHigh>0) {
            for (int i = 0; i < arrHigh; i++) {
                if (array[i][arrLength - i - 1] < target && array[arrHigh - 1][arrLength - i - 1] + 1 > target) {
                    for (int j = 0; j < arrHigh - i; j++) {
                        if (array[j][arrLength - i - 1] == target) {
                            return true;
                        }
                    }

                } else if (array[i][arrLength - i - 1] > target && array[i][0] - 1 < target) {
                    for (int j = 0; j < arrLength - i; j++) {
                        if (array[i][j] == target) {
                            return true;
                        }
                    }
                } else if (array[i][arrLength - i - 1] == target) {
                    return true;
                }
            }

        }
        return false;
    }

}
