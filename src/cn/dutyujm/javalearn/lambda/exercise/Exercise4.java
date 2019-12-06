package cn.dutyujm.javalearn.lambda.exercise;

import cn.dutyujm.javalearn.lambda.data.Person;

import java.util.ArrayList;

public class Exercise4 {
    public static void main(String[] args) {
        /**删除集合中的元素*/
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("张三",10));
        list.add(new Person("李四",12));
        list.add(new Person("王五",32));
        list.add(new Person("赵六",78));
        list.add(new Person("是是",23));
        list.add(new Person("多少",54));
        list.add(new Person("覆盖",32));
        list.add(new Person("发到",87));

        list.removeIf(ele -> ele.age>30);


        System.out.println(list);
    }


}
