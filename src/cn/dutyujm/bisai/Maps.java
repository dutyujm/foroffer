package cn.dutyujm.bisai;

import java.util.ArrayList;

public class Maps {

    //地图池
    private static final ArrayList<ConcreteMap> maps = new MapCreator().creatMaps();

    //饿汉式单例模式
    private Maps() {}

    //获取测试地图组
    public static ArrayList<ConcreteMap> getMaps() {
        return maps;
    }

}

