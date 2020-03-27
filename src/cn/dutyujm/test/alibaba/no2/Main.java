package cn.dutyujm.test.alibaba.no2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<String> stringArrayList = new ArrayList<>();
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = in.next();
            //把输入的字符串转化为歌曲类
            songs.add(new Song(s.length(),charToInt(s.charAt(0)),charToInt(s.charAt(s.length()-1))));
        }

        Collections.sort(songs,(o1,o2)->{//先对段律类进行大致的排序
            if (o1.getStart()>=o2.getEnd()) {//如果o1的开始在o2的后面开始则o1大于o2的
                return 1;
            }else if (o1.getStart()==o2.getStart()){//如果o1,o2在同一个地方开始
                if (o1.getLength()>o2.getLength()){
                    return 1;
                }else {
                    return 0;
                }
            }
            //TODO：更多比较逻辑的判断
            return -1;
        });
        //TODO：对段律数组进行遍历，从小到大即是最大高昂
    }
    //ascii码转化成数组下表
    public static int charToInt(char a) {
        return a-97;
    }
    public static char intToChar(int a) {
        return (char) (a+97);
    }
    /**
     * DESCRIPTION:段律类，将输入的字符串转化为类型，
     */
    static class Song  {
        //字符串长度
        int length;
        //段律开始的地方（ascii码-97）
        int start;
        //段律结束的地方（ascii码-97）
        int end;

        public Song(int length, int start, int end) {
            this.length = length;
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Song{" +
                    "length=" + length +
                    ", start=" + start +
                    ", end=" + end +
                    '}';
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

    }
}
