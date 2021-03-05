package cn.dutyujm.sort;

import java.util.Objects;

public class KuaiPai {
    public void quickSort(int [] array,int left,int right) {
        if(left>right){
            return;
        }
        int lp = left;
        int rp = right;
        int tmp = array[lp];
        while (lp < rp) {
            while (lp < rp && array[rp] >= tmp) {
                rp--;
            }
            while (lp < rp && array[lp] <= tmp) {
                lp++;
            }
            if (lp<rp) {
                int t = array[rp];
                array[rp] = array[lp];
                array[lp] = t;
            }

        }
        array[left] =array[lp];
        array[lp] = tmp;
        quickSort(array, left, lp - 1);
        quickSort(array, lp + 1, right);

    }

    private void myQuickSort(int[] arr,int left ,int right) {
        if (left>right) {
            return;
        }
        int lp = left;
        int rp = right;
        int tmp = arr[lp];
        while (lp<rp) {
            while (lp<rp&&arr[rp]<=tmp) {
                rp--;
            }
            while (lp<rp && arr[lp]>=tmp) {
                lp++;
            }
            if (lp<rp) {
                int t = arr[lp];
                arr[lp] = arr[rp];
                arr[rp] = t;
            }
        }
        arr[left] = arr[lp];
        arr[lp] = tmp;
        quickSort(arr,left,lp-1);
        quickSort(arr,lp+1,right);


    }


    public static void main(String[] args) {
        KuaiPai kuaiPai = new KuaiPai();
        int[]  array = new int[]{1,3,45,32,5,3,23,2,32,3,21,4,1,1};
         kuaiPai.quickSort(array,0,array.length-1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
