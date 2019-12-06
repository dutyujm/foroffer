package cn.dutyujm.homework;

import java.util.ArrayList;
import java.util.List;

public class StockMan {
   private String stockName ;
   private List<BrokerInterface> brokerInterfaceList = new ArrayList<>();

    public StockMan(String stockName) {
        this.stockName = stockName;
    }

    public void register(BrokerInterface brokerInterface){
        brokerInterfaceList.add(brokerInterface);
    }

    public void notity(){
        for (BrokerInterface broker : brokerInterfaceList) {
            broker.update(this.stockName);
        }
    }

    public String getStockName() {
        return stockName;
    }
}
