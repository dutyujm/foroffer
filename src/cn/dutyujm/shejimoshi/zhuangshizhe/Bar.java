package cn.dutyujm.shejimoshi.zhuangshizhe;

public class Bar {
    public static void main(String[] args) {
        Drink drink = new Espresso();

        drink =  new Chocolate(drink);
        drink =  new Chocolate(drink);
        drink = new Chocolate(drink);
        System.out.println(drink.getDes());
        System.out.println(drink.cost());

    }

}
