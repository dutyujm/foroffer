package cn.dutyujm.shejimoshi.adapter;


public class HttpHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handle(Object handler) {
        ((HttpController)handler).doSimpleHandler();

    }
}
