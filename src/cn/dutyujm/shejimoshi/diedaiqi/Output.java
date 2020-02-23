package cn.dutyujm.shejimoshi.diedaiqi;

import java.util.Iterator;
import java.util.List;

public class Output {
    List<ConcreteAggregate> list;

    public Output(List<ConcreteAggregate> list) {
        this.list = list;
    }

    public  void print(Iterator iterator) {
        while (iterator.hasNext()) {
          Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
    public void printCollege() {
        Iterator<ConcreteAggregate> iterator = list.iterator();
        while (iterator.hasNext()) {
            ConcreteAggregate next = iterator.next();
            System.out.println(next.getName());
            print(next.createIterator());
        }
    }
}
