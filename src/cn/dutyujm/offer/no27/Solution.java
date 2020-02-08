package cn.dutyujm.offer.no27;

/**
 * @Author YuJunMing
 * @Date 2020/2/7 23:08
 * DESCRIPTION: 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 *              例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba
 *              输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */
import java.util.ArrayList;
public class Solution {

    public ArrayList<String> PermutationHelp(StringBuilder str){

        ArrayList<String> result = new  ArrayList<String>();
        if(str.length() == 1) {
            result.add(str.toString());
        } else {
            for(int i = 0; i < str.length(); i++){
                if(i== 0  || str.charAt(i) != str.charAt(0)) {
                    char temp = str.charAt(i);
                    str.setCharAt(i, str.charAt(0));
                    str.setCharAt(0, temp);
                    ArrayList<String> newResult = PermutationHelp(new StringBuilder(str.substring(1)));
                    for(int j =0; j < newResult.size(); j++) {
                        result.add(str.substring(0,1)+newResult.get(j));
                    }
                    //用完还是要放回去的
                    temp = str.charAt(0);
                    str.setCharAt(0, str.charAt(i));
                    str.setCharAt(i, temp);
                }
            }
            //需要在做一个排序操作
        }
        return result;
    }

    public ArrayList<String> Permutation(String str) {

        StringBuilder strBuilder = new StringBuilder(str);
        return PermutationHelp(strBuilder);

    }
}