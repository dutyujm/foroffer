package cn.dutyujm.javalearn.lambda.syntax;

import cn.dutyujm.javalearn.lambda.data.Person;

public class Syntax3 {
    public static void main(String[] args) {
        PersonCreator personCreator = () -> new Person();

        /**无参构造方法*/
        PersonCreator personCreator1 = Person::new;
        Person a = personCreator1.getPerson();

        /**有参构造方法*/
        PersonCreator2 personCreator2 = Person::new;
        Person b = personCreator2.getPerson("jack",12);
    }
}

interface PersonCreator {
    Person getPerson();
}

interface PersonCreator2 {
    Person getPerson(String name, int age);
}