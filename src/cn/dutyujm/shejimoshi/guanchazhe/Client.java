package cn.dutyujm.shejimoshi.guanchazhe;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Sina sina = new Sina();
        weatherData.register(sina);
        weatherData.setData(1.1F,3.1F,4.1F);

    }
}
