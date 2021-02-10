package cn.dutyujm.test;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            a.add(x);
            map.put(x,i);
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            a.set(map.get(x),k++);
        }
        int len=1;
        b.set(0,a.get(0));
        for(int i=1; i<a.size(); i++)
        {
            if(a.get(i)>b.get(len-1))
                b.set(len++,a.get(i));
            else
            {
                int p = lower_bound(b,0, len, a.get(i));
                b.set(p,a.get(i));
            }
        }

        System.out.println(n-len);
    }
    public static int lower_bound(List<Integer> arr, int begin, int end, int tar) {
        while(begin < end) {
            int mid = begin + (end - begin) / 2;
            // 当 mid 的元素小于 tar 时
            if(arr.get(mid) < tar)
                // begin 为 mid + 1, arr[begin] 的值会小于或等于 tar
                begin = mid + 1;
                // 当 mid 的元素大于等于 tar 时
            else if(arr.get(mid)>= tar)
                end = mid;
        }
        return begin;
    }

}
