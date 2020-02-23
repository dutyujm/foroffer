package cn.dutyujm.shejimoshi.diedaiqi;

import java.util.Iterator;

public class ConcreteIterator implements Iterator {
    Department[] departments;
    int position = 0;

    public ConcreteIterator(Department[] department) {
        this.departments = department;
    }

    @Override
    public boolean hasNext() {
        if (position>=departments.length||departments[position] == null) {
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position++;
        return null;
    }

    @Override
    public void remove() {

    }
}
