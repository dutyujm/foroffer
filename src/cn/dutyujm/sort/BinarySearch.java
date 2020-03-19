package cn.dutyujm.sort;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array ={1,3,6,7,8,9,10};
        System.out.println( binSearch_2(1,array,0,array.length-1));

    }
    public static int binSearch_2(int key,int[] array,int low,int high){
        //防越界
        if (key < array[low] || key > array[high] || low > high) {
            return -1;
        }

        int middle = (high+low)/2;

        if(array[middle]>key){
            //大于关键字
            return  binSearch_2(key,array,low,middle-1);
        }else if(array[middle]<key){
            //小于关键字
            return binSearch_2(key,array,middle+1,high);
        }else{
            return middle;
        }
    }
}
