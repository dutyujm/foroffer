package cn.dutyujm.shejimoshi.diedaiqi;

import java.util.Iterator;

public interface Aggregate {
    String getName() ;

    Iterator createIterator();

    void addDepartment(String name ,String desc);

}
