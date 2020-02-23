package cn.dutyujm.shejimoshi.guanchazhe;

public class Sina implements Observer {
    private Float temperature;
    private Float pressure;
    private Float humidity;

    @Override
    public void update(Float temperature, Float pressure, Float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("temperature="+temperature);
        System.out.println("pressure="+pressure);
        System.out.println("humidity="+humidity);
    }

}
