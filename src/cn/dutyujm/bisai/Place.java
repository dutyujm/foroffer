package cn.dutyujm.bisai;

import java.util.Objects;

public  class Place  implements  Cloneable{

    int x =0;
    int y =0;

    public Place(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        Place place = (Place) o;
        return x == place.x &&
                y == place.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Place(x,y);
    }
}
