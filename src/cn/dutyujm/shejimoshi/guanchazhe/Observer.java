package cn.dutyujm.shejimoshi.guanchazhe;

public interface Observer {
    void update(Float temperatrue,Float pressure ,Float humidity);
    void display();
}
