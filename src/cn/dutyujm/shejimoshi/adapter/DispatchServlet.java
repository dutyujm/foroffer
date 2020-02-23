package cn.dutyujm.shejimoshi.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yu
 */
public class DispatchServlet  {
    public static List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    public DispatchServlet() {
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }

    public void doDispatch() {
//        HttpController controller = new HttpController();
        AnnotationController controller =new AnnotationController();
        HandlerAdapter adapter = this.getHandler(controller);
        adapter.handle(controller);
    }

    public  HandlerAdapter getHandler(Controller controller) {
        for (HandlerAdapter adapter : handlerAdapters) {
            if (adapter.supports(controller)) {
                return adapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        DispatchServlet dispatchServlet = new DispatchServlet();
        dispatchServlet.doDispatch();
    }
}
