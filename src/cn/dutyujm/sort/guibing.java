package cn.dutyujm.sort;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Arrays;

public class guibing {
    public static void main(String []args){
        int []arr = {9,8,7,6,5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void mySort(int[] arr) {
        int []tmp = new int[arr.length];
        mySort(arr,0,arr.length-1,tmp);

    }

    private  void mySort(int[] arr,int left,int right,int []temp){
        if (left<right) {
            int mid = (right+left)/2;
            mySort(arr,left,mid,temp);
            mySort(arr,mid,right,temp);
            myMerge(arr,left,mid,right,temp);
        }
    }

    private void myMerge(int[] arr, int left,int mid ,int right,int[] temp) {
        int i  = left;
        int j = mid+1;
        int  t = 0;
        while (i<=mid&&j<=right) {
            if (arr[i]<arr[j]) {
                temp[t++] = arr[i++];
            }else {
                temp[t++] = arr[j++];
            }
        }
        while (i<=mid) {
            temp[t++] = arr[i++];
        }
        while (j<=right) {
            temp[t++] = arr[j++];
        }
        t =0;
        while (left<right) {
            arr[left++] = temp[t++];
        }
    }




    public static void sort(int []arr){
        //在排序前，先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间
        int []temp = new int[arr.length];
        sort(arr,0,arr.length-1,temp);
    }
    private static void sort(int[] arr,int left,int right,int []temp){
        if(left<right){
            int mid = (left+right)/2;
            //左边归并排序，使得左子序列有序
            sort(arr,left,mid,temp);
            //右边归并排序，使得右子序列有序
            sort(arr,mid+1,right,temp);
            //将两个有序子数组合并操作
            merge(arr,left,mid,right,temp);
        }
    }
    private static void merge(int[] arr,int left,int mid,int right,int[] temp){
        int i = left;//左序列指针
        int j = mid+1;//右序列指针
        int t = 0;//临时数组指针
        while (i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[t++] = arr[i++];
            }else {
                temp[t++] = arr[j++];
            }
        }
        while(i<=mid){//将左边剩余元素填充进temp中
            temp[t++] = arr[i++];
        }
        while(j<=right){//将右序列剩余元素填充进temp中
            temp[t++] = arr[j++];
        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while(left <= right){
            arr[left++] = temp[t++];
        }
    }
}
