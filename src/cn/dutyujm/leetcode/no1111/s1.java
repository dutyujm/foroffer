package cn.dutyujm.leetcode.no1111;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class s1 {


    public static void main(String[] args) {
        String res;
        String s = "2020-01-03";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long ts = date.getTime();
        res = String.valueOf(ts);
        System.out.println(res);
    }
}
