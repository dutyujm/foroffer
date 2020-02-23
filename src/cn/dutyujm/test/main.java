package cn.dutyujm.test;


import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Point> arrayList = new ArrayList<>();
        arrayList.add(new Point(1,1));
        arrayList.add(new Point(2,2));
        arrayList.add(new Point(3,3));
        arrayList.add(new Point(4,4));

        for (Point point : arrayList) {
            point.setY(5);
        }
        System.out.println(arrayList);


    }
}
