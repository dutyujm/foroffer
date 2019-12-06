package cn.dutyujm.homework;

import java.util.LinkedList;
import java.util.List;

public class Broker implements BrokerInterface {
    private String brokerName ;
    private List<Stock>  stockList ;
    @Override
    public void update(String stackName) {
        System.out.println(brokerName);
        System.out.println(stackName);
        for (Stock stock:stockList
             ) {
            if (stackName.equals(stock.getStockName())){
                System.out.println("最新价格为:"+stock.getValue());
            }

        }
    }

    public void newStock(Stock stock) {
        stockList.add(stock);
    }

    public void Broker(String brokerName) {
        this.brokerName = brokerName;
    }
}
