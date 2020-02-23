package cn.dutyujm.multithread;

public class Test {
    public static void main(String[] args)  {
        StringBuffer sb = new StringBuffer("Hello ");
        System.out.println("Before change, sb = " + sb);
        changeData(sb);
        System.out.println("After change, sb = " + sb);
    }
    public static void changeData(StringBuffer strBuf) {
        StringBuffer sb2 = new StringBuffer("Hi，I am ");
        strBuf = sb2;
        sb2.append("World!");
    }
}