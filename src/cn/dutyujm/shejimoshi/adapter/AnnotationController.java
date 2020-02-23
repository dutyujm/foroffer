package cn.dutyujm.shejimoshi.adapter;

public class AnnotationController implements Controller {
    @Override
    public void doSimpleHandler() {
        System.out.println("Annotation");
    }
}
