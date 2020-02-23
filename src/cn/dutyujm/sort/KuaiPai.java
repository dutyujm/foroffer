package cn.dutyujm.sort;

public class KuaiPai {
    public void quickSort(int [] array,int right,int left) {
        if(right>left){
            return;
        }
        int lp = right;
        int rp = left;
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
        array[right] =array[lp];
        array[lp] = tmp;
        quickSort(array, right, lp - 1);
        quickSort(array, lp + 1, left);

    }

    public static void main(String[] args) {
        KuaiPai kuaiPai = new KuaiPai();
        int[]  array = new int[]{1,3,45,32,5};
         kuaiPai.quickSort(array,0,array.length-1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }



    }
}
