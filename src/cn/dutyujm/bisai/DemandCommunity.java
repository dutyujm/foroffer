package cn.dutyujm.bisai;

import java.util.Objects;

/**
 * @author yu
 * 需求小区
 */
public class DemandCommunity extends Place implements Cloneable {
    private int demandNumber;

    public DemandCommunity(int x, int y, int demandNumber) {
        super(x, y);
        this.demandNumber = demandNumber;
    }


    public int getDemandNumber() {
        return demandNumber;
    }

    public void setDemandNumber(int demandNumber) {
        this.demandNumber = demandNumber;
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
    public String toString() {
        return "DemandCommunity{" +
                "demandNumber=" + demandNumber +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    protected Object clone()   {
        return new DemandCommunity(x,y,demandNumber);
    }
}
