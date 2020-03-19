package cn.dutyujm.sort;

import javafx.beans.binding.ObjectBinding;

import java.util.Objects;
import java.util.Queue;

public class quick {

    public void quickSort(Integer [] array, Integer left, Integer right){
        if (left>right){
            return;
        }

        Integer lp = left;
        Integer rp = right;
        Integer tmp = array[lp];
        while (lp<rp) {
            while (lp<rp&&array[rp]>=tmp) {
                rp--;
            }
            while (lp<rp&&array[lp]<=tmp) {
                lp++;
            }
            if (lp<rp) {
                Integer t = array[lp];
                array[lp] = array[rp];
                array[rp] = t;
            }
        }
        array[left] =array[lp];
        array[lp] = tmp;

        quickSort(array, left, lp - 1);
        quickSort(array, lp + 1, right);
    }

    public static void main(String[] args) {
        quick quick = new quick();
        Integer [] arr=  new Integer[]{1,3,45,32,5,3,23,2,32,3,21,4,1,1};
        quick.quickSort(arr,0,arr.length-1);
        for (Integer i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
