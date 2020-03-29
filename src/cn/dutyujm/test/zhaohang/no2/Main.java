package cn.dutyujm.test.zhaohang.no2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        ArrayList<Collection> collections = new ArrayList<>(T);
        for (int i = 0; i < T; i++) {
            Collection collection = new Collection(in.nextInt());
            for (int j = 0; j < collection.getN(); j++) {
                collection.getSticks().add(new Stick(in.nextInt()));
            }
            for (int j = 0; j < collection.getN(); j++) {
                collection.getSticks().get(j).setWeight(in.nextInt());
            }
            Collections.sort(collection.getSticks(),(o2,o1)->{
                if (o1.getWeight()<=o2.getWeight()){
                    return 1;
                }
                else {
                    return -1;
                }

            });
            Collections.sort(collection.getSticks(),(o2,o1)->{
                if (o1.getLength()<=o2.getLength()){
                    return 1;
                }
                else {
                    return -1;
                }

            });


            collections.add(collection);
        }
        for (int i = 0; i < T ; i++) {
            int temp = 1;
            ArrayList<Stick> sticks = collections.get(i).getSticks();
            for (int j = 0; j < sticks.size()-1; j++) {

                if (sticks.get(j).compareTo(sticks.get(j+1))==-1) {
                    temp++;
                }

            }
            System.out.println(temp);
        }
//        System.out.println(collections);

    }
    static class Collection{
        int n;
        ArrayList<Stick> sticks;

        @Override
        public String toString() {
            return "Collection{" +
                    "n=" + n +
                    ", sticks=" + sticks +
                    '}';
        }

        public Collection(int n) {
            this.n = n;
            this.sticks = new ArrayList<>(n);
        }

        public int getN() {
            return n;
        }

        public void setN(int n) {
            this.n = n;
        }

        public ArrayList<Stick> getSticks() {
            return sticks;
        }

        public void setSticks(ArrayList<Stick> sticks) {
            this.sticks = sticks;
        }
    }

    static class Stick implements Comparable{
        int weight ;
        int length ;

        public Stick(int length) {
            this.length = length;
        }

        public Stick(int weight, int length) {
            this.weight = weight;
            this.length = length;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        @Override
        public String toString() {
            return "\tStick{" +
                    "weight=" + weight +
                    ", length=" + length +
                    '}'+"\n";
        }

        @Override
        public int compareTo(Object o) {
            Stick a = (Stick) o;
            if (this.getLength()<=a.getLength()&&this.getWeight()<=a.getWeight()){
                return 1;
            }
            return -1;
        }
    }
}
