package cn.dutyujm.no2;

public class no2 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We Are Happy");

        no2 no2 =new no2();
        System.out.println(no2.replaceSpace(str));
    }
    public String replaceSpace(StringBuffer str) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c == ' '){
                sb.append("%20");
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
