package cn.dutyujm.shejimoshi.diedaiqi;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<ConcreteAggregate> aggregates = new ArrayList<>();

        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        aggregates.add(concreteAggregate);

        Output output = new Output(aggregates);
        output.printCollege();
    }
}
