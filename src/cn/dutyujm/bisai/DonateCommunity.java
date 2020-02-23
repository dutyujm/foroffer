package cn.dutyujm.bisai;

/**
 * @author yu
 * 捐赠小区
 */
public class DonateCommunity extends Place implements Cloneable {
    private int donationsNumber;

    public DonateCommunity(int x, int y,int donationsNumber) {
        super(x, y);
        this.donationsNumber = donationsNumber;
    }

    public int getDonationsNumber() {
        return donationsNumber;
    }

    public void setDonationsNumber(int donationsNumber) {
        this.donationsNumber = donationsNumber;
    }

    @Override
    public String toString() {
        return "DonateCommunity{" +
                "donationsNumber=" + donationsNumber +
                ", x=" + x +
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
    protected Object clone() throws CloneNotSupportedException {
        return new DonateCommunity(x,y,donationsNumber);
    }
}
