package cn.dutyujm.bisai;

public class Location implements Cloneable{
    private Place place;
    private Courier courier;

    public Location() {
    }

    public Location(Place place, Courier courier) {
        this.place = place;
        this.courier = courier;
    }

    public Location(Courier courier) {
        this.courier = courier;
    }

    public Location(Place place) {
        this.place = place;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Location location = new Location();
        location.setPlace((Place) place.clone());
        location.setCourier((Courier) courier.clone());
        return location;
    }

    @Override
    public String toString() {
        return "Location{" +
                "place=" + place +
                ", courier=" + courier +
                '}';
    }
}
