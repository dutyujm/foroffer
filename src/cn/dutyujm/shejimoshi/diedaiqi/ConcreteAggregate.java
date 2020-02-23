package cn.dutyujm.shejimoshi.diedaiqi;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcreteAggregate implements Aggregate {

    Department[] departments;
    int number = 0;

    public ConcreteAggregate() {
        this.departments = new Department[5];
        addDepartment("sdad专业","dsada");
        addDepartment("vzxcvc专业","rewqer");

        addDepartment("iktjyu专业","bgfrb");

        addDepartment("vw专业","v   v");

    }

    @Override
    public String getName() {
        return "某某学院";
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(departments);
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departments[number] = department;
        number++;

    }
}
