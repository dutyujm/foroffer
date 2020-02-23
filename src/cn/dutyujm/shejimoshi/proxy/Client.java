package cn.dutyujm.shejimoshi.proxy;

public class Client {
    public static void main(String[] args) {
        ITeacher teacher = new Teacher();
        ITeacher proxyFactory = (ITeacher) new ProxyFactory(teacher).getProxyInstance();

        proxyFactory.teach();
        proxyFactory.say("sssss");
    }
}
