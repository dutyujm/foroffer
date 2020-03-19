package cn.dutyujm.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

public class fgasdfd {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        BigDecimal bigDecimal = new BigDecimal(3);
        bigDecimal.add(new BigDecimal(3));
        System.out.println(bigDecimal);
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(3);
        integers.add(4);
        integers.add(2);
        integers.add(4);
        integers.add(7);
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
