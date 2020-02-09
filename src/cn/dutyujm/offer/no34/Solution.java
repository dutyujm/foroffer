package cn.dutyujm.offer.no34;

import cn.dutyujm.javalearn.Collection.Person;

import java.util.*;


/**
 * @Author YuJunMing
 * @Date 2020/2/9 15:08
 * DESCRIPTION: 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置,
 *              如果没有则返回 -1（需要区分大小写）.
 */
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if (str.length()==0){
            return -1;
        }
        LinkedHashMap<Character,Integer> map = new LinkedHashMap <>();
        int min = -1 ;

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (map.containsKey(charArray[i])) {
                map.replace(charArray[i],-1);
            }else {
                map.put(charArray[i],i);
            }
        }
        min = 10001;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue()<min&&entry.getValue()!=-1){

                min = entry.getValue();
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.FirstNotRepeatingChar("googgle"));
    }
}