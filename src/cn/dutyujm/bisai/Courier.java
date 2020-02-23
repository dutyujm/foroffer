package cn.dutyujm.bisai;

import java.util.Objects;

/**
 * @author yu
 * 快递员类
 */
public class Courier extends Place implements Cloneable {
    protected int amount;

    public Courier(int x, int y, int amount) {
        super(x, y);
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
       return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        return "Courier{" +
                "amount=" + amount +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return new Courier(x,y,amount);
    }
}
