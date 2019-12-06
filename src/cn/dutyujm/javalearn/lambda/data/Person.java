package cn.dutyujm.javalearn.lambda.data;

import java.util.Objects;

public class Person {
    public String name;
    public int age;

    public Person() {
        System.out.println("Person类的无参构造方法");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person类的有参构造方法");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
