package cn.dutyujm.shejimoshi.proxy;

public class Teacher implements ITeacher {

    @Override
    public void teach() {
        System.out.println("wow");
    }

    @Override
    public void say(String name) {
        System.out.println(name);
    }
}
