package cn.dutyujm.shejimoshi.adapter;

public class SimpleController implements Controller {
    @Override
    public void doSimpleHandler() {
        System.out.println("Simple");
    }
}
