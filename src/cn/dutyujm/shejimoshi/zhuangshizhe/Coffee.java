package cn.dutyujm.shejimoshi.zhuangshizhe;

public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
