package cn.dutyujm.bisai;

import java.util.ArrayList;
import java.util.Objects;

import static cn.dutyujm.bisai.MapCreator.COURIER_SIZE;
import static cn.dutyujm.bisai.MapCreator.MAP_SIZE;

public class ConcreteMap  implements Cloneable {
    private Location [][] map;
    private ArrayList<DemandCommunity> demandCommunities;
    private ArrayList<DonateCommunity> donateCommunities;
    private Store store;
    private Courier courier;

    public ConcreteMap(Location[][] map, ArrayList<DemandCommunity> demandCommunities, ArrayList<DonateCommunity> donateCommunities, Store store, Courier courier) {
        this.map = map;
        this.demandCommunities = demandCommunities;
        this.donateCommunities = donateCommunities;
        this.store = store;
        this.courier = courier;
    }

    public ConcreteMap() {
    }

    public Location[][] getMap() {
        return map;
    }

    public void setMap(Location[][] map) {
        this.map = map;
    }

    public ArrayList<DemandCommunity> getDemandCommunities() {
        return demandCommunities;
    }

    public void setDemandCommunities(ArrayList<DemandCommunity> demandCommunities) {
        this.demandCommunities = demandCommunities;
    }

    public ArrayList<DonateCommunity> getDonateCommunities() {
        return donateCommunities;
    }

    public void setDonateCommunities(ArrayList<DonateCommunity> donateCommunities) {
        this.donateCommunities = donateCommunities;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    //往东走
    public Boolean e(){
        if (courier.getX()+1<MapCreator.MAP_SIZE){
            this.courier.setX(courier.getX()+1);
        }
        return doSomething();

    }
    //往西走
    public Boolean w(){
        if (courier.getX()-1>=0){
            this.courier.setX(courier.getX()-1);
        }
        return doSomething();

    }
    //往南走
    public Boolean s(){
        if (courier.getY()+1<MapCreator.MAP_SIZE){
            this.courier.setY(courier.getY()+1);
        }
        return doSomething();

    }
    //往北走
    public Boolean n(){
        if (courier.getY()-1>=0){
            this.courier.setY(courier.getY()-1);
        }
        return doSomething();

    }
    public boolean doSomething(){

        if (store.equals(courier)){
            System.out.println("到达仓库,背包装满");
            courier.setAmount(MapCreator.COURIER_SIZE);
        }else if (donateCommunities.contains(courier)){
               System.out.println("到达捐献小区");
               Integer donationsNumber = donateCommunities.get(donateCommunities.indexOf(courier)).getDonationsNumber();
               if (donationsNumber+courier.getAmount()<=COURIER_SIZE) {
                    courier.setAmount(donationsNumber+courier.getAmount());
                    donateCommunities.remove(courier);
                    map[courier.getX()][courier.getY()]=null;
                    System.out.println("快递员还剩"+courier.getAmount());
               }else {
                   donateCommunities.get(donateCommunities.indexOf(courier)).setDonationsNumber(courier.getAmount()+donationsNumber-COURIER_SIZE);
                   courier.setAmount(COURIER_SIZE);
                   System.out.println("快递员还剩"+courier.getAmount());
                   System.out.println("小区还剩"+donateCommunities.get(donateCommunities.indexOf(courier)).getDonationsNumber());
               }

        }else if (demandCommunities.contains(courier)){
            System.out.println("到达需求小区");
            Integer demandNumber = demandCommunities.get(demandCommunities.indexOf(courier)).getDemandNumber();
            if (demandNumber<=courier.getAmount()){
                demandCommunities.remove(courier);
                if (isComplete()) {
                    return true;
                }
                courier.setAmount(courier.getAmount()-demandNumber);
                System.out.println("快递员还剩"+courier.getAmount());
                map[courier.getX()][courier.getY()]=null;
            }else {
                demandCommunities.get(demandCommunities.indexOf(courier)).setDemandNumber(demandNumber-courier.getAmount());
                courier.setAmount(0);
                System.out.println("快递员还剩"+courier.getAmount());
                System.out.println("小区还缺"+ demandCommunities.get(demandCommunities.indexOf(courier)).getDemandNumber());

            }
        }
            return false;
    }
    public void drawMap( ){
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int k = 0; k < MAP_SIZE; k++) {
                if(Objects.equals(k,courier.getX())&&Objects.equals(i,courier.getY())){
                    System.out.format(" \33[32;4m人");//%n表示换行
                }else if (demandCommunities.contains(new DemandCommunity(k,i,0))){
                    System.out.format(" \33[34;4m求");
                }else if (donateCommunities.contains(new DonateCommunity(k,i,0))){
                    System.out.format(" \33[35;4m捐");
                }else if (store.equals(new Store(k,i))){
                    System.out.format(" \33[36;4m仓");
                } else{
                    System.out.format(" \33[30;4m口");
                }
            }
            System.out.println("");
        }
    }
    public boolean isComplete(){
        if (demandCommunities.size()==0) {
            return true;
        }
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ConcreteMap concreteMap =new ConcreteMap();
        concreteMap.setMap(map.clone());
        concreteMap.setCourier((Courier) courier.clone());
        concreteMap.setDemandCommunities((ArrayList<DemandCommunity>) demandCommunities.clone());
        concreteMap.setDonateCommunities((ArrayList<DonateCommunity>) donateCommunities.clone());
        concreteMap.setStore((Store) store.clone());
        return concreteMap;
    }
}
