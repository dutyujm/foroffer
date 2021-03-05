package cn.dutyujm.test.jd;

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
        String s = scanner.next();
        if (s != null && !"".equals(s)) {
            String regex = "/^(1949|19[5-9]\\d|20\\d{2}|2100)$/";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                String matcherString = matcher.group();
                System.out.println(matcherString);
            }
        }
    }
}
