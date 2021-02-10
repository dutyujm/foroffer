package cn.dutyujm.test;
import java.text.Normalizer.Form;
import java.util.Scanner;
public class sda {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        //System.out.println(a);
        System.out.println("Hello World!");
        int m = 5;
        int[] arr = {2,5,3,1,3,2,4,1,5,0,4,3};
        int fast = 0;
        int slow = 0;
        int minVal = Integer.MAX_VALUE;
        // 判断子区间是否打完所有颜色
        boolean[] tmp = new boolean[m+1];
        tmp[0] = true;
        for (fast = 1; fast < arr.length; fast++) {
            if(arr[fast]== 0) {
                continue;
            }
            // 判断是否已经打完所有颜色
            tmp[arr[fast]] = true;
            //
            boolean isAllTrue = true;
            for(int i=1;i<m+1;i++) {
                isAllTrue =isAllTrue&tmp[i];
            }
            if(isAllTrue) {
                // 包含全部。就和已有最小值做对比
                // tmp 回复初始化
                // 对比大小
                if(minVal>(fast-slow+1)){
                    minVal = fast-slow+1;
                }
                for(int i = 1 ;i<m+1;i++) {
                    tmp[i] = false;
                }
                slow = fast;
            }else {
                // fast向前走的时候，判断与slow是否相同，相同，slow往前走
                boolean a = true;
                // slow 往前走之后判断一下区间是否已有与slow相同的值如果有，则再走
                while(a) {
                    if(slow<fast && arr[fast] == arr[slow]) {
                        slow++;
                    } else if(slow<fast && arr[slow] == 0 ) {
                        slow++;
                    }else if (slow<fast && f1(arr,fast,slow) ) {
                        slow++;
                    }else{
                        a = false;
                    }
                }
            }

        }
        System.out.println(minVal);
    }
    private static boolean f1(int[] arr,int fast,int slow) {
        for (int i = slow+1; i < fast; i++) {
            if (arr[i] == arr[slow]) {
                return true;
            }
        }
        return false;
    }

}
