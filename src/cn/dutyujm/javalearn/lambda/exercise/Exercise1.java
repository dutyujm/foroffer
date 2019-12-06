package cn.dutyujm.javalearn.lambda.exercise;

import cn.dutyujm.javalearn.lambda.data.Person;

import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("张三",10));
        list.add(new Person("李四",12));
        list.add(new Person("王五",32));
        list.add(new Person("赵六",78));
        list.add(new Person("是是",23));
        list.add(new Person("多少",54));
        list.add(new Person("但是",32));
        list.add(new Person("发到",87));

        list.sort((o1,o2) ->  o2.age-o1.age);

        System.out.println(list);

    }
}
