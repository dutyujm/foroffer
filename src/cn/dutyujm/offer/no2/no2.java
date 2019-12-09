package cn.dutyujm.offer.no2;

public class no2 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We Are Happy");

        no2 no2 =new no2();
        System.out.println(no2.replaceSpace(str));
    }
    public String replaceSpace(StringBuffer str) {
        /**
         * 方法1
         */
//        StringBuffer sb = new StringBuffer();
//        for(int i=0;i<str.length();i++){
//            char c = str.charAt(i);
//            if(c == ' '){
//                sb.append("%20");
//            }else{
//                sb.append(c);
//            }
//        }
//        return sb.toString();
        /**
         * 方法2
         */
        int t = str.length();
        for(int i=0 ;i < t;i++){
            if (str.charAt(0)!=' '){

            str.append(str.charAt(0));
            str.delete(0,1);

            }else if(str.charAt(0)==' '){
                str.append("%20");
                str.delete(0,1);
            }

        }

        return str.toString();
    }
}
