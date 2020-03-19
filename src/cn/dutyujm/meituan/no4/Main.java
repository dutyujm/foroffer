package cn.dutyujm.meituan.no4;

import java.util.*;

/**
 * @Author YuJunMing
 * @Date 2020/3/12 19:17
 * DESCRIPTION: 某公司要建厂投产一种产品，已知该产品共需要k种不同的原材料才能生产，而在这个工厂周围有n个可供建厂的地址，
 * 同时这n个位置都生产该产品所需k种原材料中的一种，在这n个位置间存在一些通行的道路，我们可以视这些道路的长度都为1，保证这些位置之间两两都是连通的。
 * 很显然工厂面临一个很严峻的问题，就是原料采集，我们定义采集一种原材料的花费为工厂所在位置到最近的一个该材料的采集点的距离，
 * 在一个位置建厂的成本为k种原材料的采集花费之和。
 * 请你对每一个位置都求出其建厂的花费。
 *
 *
 *
 * 输入第一行有三个正整数n,m,k，分别代表可供选择的建厂地址数量，编号为从1到n，这些地址之间的道路数量，生产所需的原材料数量，
 * 编号为1到k。(1<=n,m,<=50000,1<=k<=100)
 * 输入第二行包含n个正整数，第 i 个正整数a_i表示第i个地址是第a_i种原料的采集点。(1<=a_i<=k)
 * 接下来有m行，每行有两个正整数 u，v，表示u号位置和v号位置之间有一条连接的路径，可能存在重边或自环（如样例所示）。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        Map<Integer,Factory> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int tmp = scanner.nextInt();
            map.put(i+1,new Factory(i+1,tmp));
        }

        for (int i = 0; i < m; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            map.get(from).getConnect().add(to);
            map.get(from).getConnect().remove(from);
            map.get(to).getConnect().add(from);
            map.get(to).getConnect().remove(to);
        }
        System.out.println(map);

        for (int i = 0; i < n ; i++) {

        }
    }
}

class Factory {
    int num;
    int kind;
    HashSet<Integer> connect ;

    public Factory(int num, int kind) {
        this.num = num;
        this.kind = kind;
        this.connect = new HashSet<Integer>();
    }

    public HashSet<Integer> getConnect() {
        return connect;
    }

    public void setConnect(HashSet<Integer> connect) {
        this.connect = connect;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "num=" + num +
                ", kind=" + kind +
                ", connect=" + connect +
                '}';
    }
}
