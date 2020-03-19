package cn.dutyujm.test;

import java.util.*;

public class sda {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Box> box = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            box.add(new Box(in.nextInt(),in.nextInt()));
        }
        System.out.println( new Box(1,1).compareTo(new Box(2,2)));
        Collections.sort(box,Box::compareTo);
        Iterator iterator = box.listIterator();
        for (int i = 0; i < box.size(); i++) {
            if (box.get(i).compareTo(box.get(i+1))==1) {

            }
        }
        System.out.println(4);
    }
    static class Box implements Comparable {
        int x ;
        int y ;

        public Box(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Object o) {
            Box a = (Box) o;
             if(a.x>this.x&&a.y>this.y){
                 return 1;
             }else {
                 return -1;
             }
        }

        @Override
        public String toString() {
            return "Box{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }


}
