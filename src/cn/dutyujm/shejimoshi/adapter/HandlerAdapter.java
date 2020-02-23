package cn.dutyujm.shejimoshi.adapter;


public interface HandlerAdapter {
    boolean supports(Object handler);

    void handle(Object handler);

}
