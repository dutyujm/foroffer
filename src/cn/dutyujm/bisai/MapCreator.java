package cn.dutyujm.bisai;

import cn.dutyujm.multithread.t2.M;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class MapCreator {
    //常量池
    //需求小区数量
    public static Integer DEMAND_COMMUNITY_AMOUNT =5;
    //捐献小区最大数量（随机范围）
    public static Integer DONATE_COMMUNITY_MAX_AMOUNT =5;
    //地图大小
    public static Integer MAP_SIZE =10;
    //邮递员携带上限
    public static Integer COURIER_SIZE=100;
    //最大执行步骤
    public static Integer MAX_COUNT= 1000;
    //最大需求数量
    public static Integer MAX_DEMAND_AMOUNT = 100;
    //最大捐献数量
    public static Integer MAX_DONATE_AMOUNT = 100;
    //生成实例地图数量
    public static Integer MAP_NUMBER = 5;
    //捐赠小区类型（字典）
    public static Integer DEMAND_COMMUNITY_TYPE = 3;
    //快递员类型（字典）
    public static Integer COURIER_TYPE = 2;
    //需求小区类型（字典）
    public static Integer DONATE_COMMUNITY_TYPE = 1;
    //重合
    public ConcreteMap create() {
        //生成矩阵
        Location [][] locations = new Location[MAP_SIZE][MAP_SIZE];

        //记载生成情况，避免生成在同一地点
        ArrayList<Place> arrayList = new ArrayList();
        //记载需求小区
        ArrayList<DemandCommunity> demandCommunities = new ArrayList<>();
        //记载捐献小区
        ArrayList<DonateCommunity> donateCommunities = new ArrayList<>();
        //随机生成器
        Random random =new Random();
        Integer DONATE_COMMUNITY_AMOUNT = random.nextInt(DONATE_COMMUNITY_MAX_AMOUNT);


//        随机生成邮递员和配送站
            int x= random.nextInt(MAP_SIZE) ;
            int y= random.nextInt(MAP_SIZE);
            Courier courier = new Courier(x,y,COURIER_SIZE);
            Store store = new Store(x,y);
            arrayList.add(new Place(x,y));
            locations[x][y] = new Location(store,courier);
//          随机生成需求小区
        for (Integer i = 0; i < DEMAND_COMMUNITY_AMOUNT; i++) {
            x = random.nextInt(MAP_SIZE);
            y = random.nextInt(MAP_SIZE);
            if (arrayList.contains(new Place(x,y))){
                i--;
            }else {
                DemandCommunity demandCommunity= new DemandCommunity(x,y,random.nextInt(MAX_DEMAND_AMOUNT)+1);
                demandCommunities.add(demandCommunity);
                arrayList.add(new Place(x,y));
                locations[x][y] = new Location(demandCommunity);
            }
        }
        //          随机生成捐献小区
        for (Integer i = 0; i < DONATE_COMMUNITY_AMOUNT; i++) {
            x = random.nextInt(MAP_SIZE);
            y = random.nextInt(MAP_SIZE);
            if (arrayList.contains(new Place(x,y))){
                i--;
            }else {
                DonateCommunity donateCommunity= new DonateCommunity(x,y,random.nextInt(MAX_DONATE_AMOUNT)+1);
                donateCommunities.add(donateCommunity);
                arrayList.add(new Place(x,y));
                locations[x][y] = new Location(donateCommunity);


            }
        }

        return new ConcreteMap(locations,demandCommunities,donateCommunities,store,courier);

    }


    public   ArrayList<ConcreteMap> creatMaps() {
        MapCreator mapCreator = new MapCreator();
        ArrayList<ConcreteMap> concreteMaps = new ArrayList<>();
        for (Integer i = 0; i < MAP_NUMBER; i++) {
            concreteMaps.add(mapCreator.create());
        }
        return concreteMaps;
    }

}
