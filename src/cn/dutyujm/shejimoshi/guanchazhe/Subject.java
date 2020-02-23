package cn.dutyujm.shejimoshi.guanchazhe;

/**
 * @author yu
 */
public interface Subject {

    void register(Observer observer);
    void remove(Observer observer);
    void notifyObserver();

}
