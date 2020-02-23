package cn.dutyujm.bisai;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        Solution solution = new Solution();
        ArrayList<ConcreteMap> maps = Maps.getMaps();
        for (Integer i = 0; i < MapCreator.MAP_NUMBER; i++) {
            Scanner scanner= new Scanner(System.in);
            ConcreteMap concreteMap = (ConcreteMap) maps.get(i).clone();
            concreteMap.drawMap();
            int count = 0;
            int exitFlag =0;
            while (exitFlag!=1){
                System.out.println("请输入下一步(用大写的EWSN移动)：");
//                String next = solution.nextStep(concreteMap);
                String next = scanner.next();
                    switch (next){
                        case "E":{
                            count++;
                            if (concreteMap.e()) {
                                System.out.println("比赛完结");
                                System.out.println("所用步数:"+count);
                                exitFlag=1;
                                break;
                            }
                            concreteMap.drawMap();
                            break;
                        } //东
                        case "W":{
                            count++;
                            if (concreteMap.w()) {
                                System.out.println("比赛完结");
                                System.out.println("所用步数:"+count);
                                exitFlag=1;

                                break;
                            }
                            concreteMap.drawMap();
                            break;
                        }//西
                        case "S": {
                            count++;
                            if (concreteMap.s()) {
                                System.out.println("比赛完结");
                                System.out.println("所用步数:"+count);
                                exitFlag=1;

                                break;
                            }
                            concreteMap.drawMap();
                            break;
                        }//南
                        case "N": {
                            count++;
                            if (concreteMap.n()) {
                                System.out.println("比赛完结");
                                System.out.println("所用步数:"+count);
                                exitFlag=1;

                                break;
                            }
                            concreteMap.drawMap();
                            break;
                        }//北
                        default:{
                            count++;
                            System.out.println("输入错误");
                            concreteMap.drawMap();
                            break;
                        }
                    }
                }
            }
        Maps.getMaps().get(0).drawMap();
    }



}

