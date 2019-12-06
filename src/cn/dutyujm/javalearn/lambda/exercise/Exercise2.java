package cn.dutyujm.javalearn.lambda.exercise;

import cn.dutyujm.javalearn.lambda.data.Person;

import java.util.TreeSet;

public class Exercise2 {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>((o1, o2) -> {
            if (o1.age >= o2.age){
                return -1;
            }else {
                return 1;
            }
        });
        set.add(new Person("张三",10));
        set.add(new Person("李四",12));
        set.add(new Person("赵六",78));
        set.add(new Person("王五",32));
        set.add(new Person("是是",23));
        set.add(new Person("多少",54));
        set.add(new Person("覆盖",32));
        set.add(new Person("发到",87));



        System.out.println(set);
    }
}
