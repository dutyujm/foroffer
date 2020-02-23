package cn.dutyujm.shejimoshi.guanchazhe;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private Float temperature;
    private Float pressure;
    private Float humidity;

    public Float getTemperature() {
        return temperature;
    }

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    public Float getPressure() {
        return pressure;
    }


    public Float getHumidity() {
        return humidity;
    }


    @Override
    public void register(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(getTemperature(),getPressure(),getHumidity());
        }
    }
    public void setData(Float temperature, Float pressure, Float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }
    public void dataChange() {
        notifyObserver();
    }

}
