package cn.dutyujm.shejimoshi.singleton;

 class Singleton {
    private  Singleton(){

    }
    private static Singleton instance = new Singleton();

     public static Singleton getInstance() {
         return instance;
     }
 }
class test {
    public static void main(String[] args) {
        Singleton i1 = Singleton.getInstance();
        Singleton i2 = Singleton.getInstance();
        System.out.println(i1==i2);
    }
}