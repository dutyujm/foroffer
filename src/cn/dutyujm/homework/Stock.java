package cn.dutyujm.homework;

public class Stock extends StockMan {
    private int value;

    public Stock(String stockName) {
        super(stockName);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
