package cn.dutyujm.bisai;

/**
 * @author yu
 * 仓库类
 */
public class Store extends Place implements Cloneable {

    public Store(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "Store{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone()  {
        return new Store(x,y);
    }
}
