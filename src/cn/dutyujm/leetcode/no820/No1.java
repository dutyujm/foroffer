package cn.dutyujm.leetcode.no820;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class No1 {
    /**
     * 小明想从一段英文短文中提取潜在的年份信息，待匹配的年份的范围为1000年至3999年，包含1000和3999。
     * 输入一段英文短文，按出现次序输出所提取到的所有可能的年份字符串。
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s != null && !"".equals(s)) {
            String regex = "^20[0-9]{2}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(s);
            ArrayList<String> temp=new ArrayList<>();
            while(matcher.find()){
                temp.add(matcher.group(1));
            }
            System.out.println(temp);
        }
    }
}
