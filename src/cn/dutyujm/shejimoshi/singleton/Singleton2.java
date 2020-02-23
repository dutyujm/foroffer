package cn.dutyujm.shejimoshi.singleton;

public class Singleton2 {
    private  static Singleton2 singleton2;
    private Singleton2() {
    }
    static {
        singleton2 = new Singleton2();

    }
    public static Singleton2 getInstance() {
        return singleton2;
    }

}
