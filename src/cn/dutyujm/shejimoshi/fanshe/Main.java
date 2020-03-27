package cn.dutyujm.shejimoshi.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Book book = new Book();

        Class bookClass = book.getClass();
        Method method = bookClass.getMethod("declaredMethod",int.class);
        Constructor constructor = bookClass.getConstructor();
        Object o = constructor.newInstance();
        System.out.println(method.invoke(o, 4));
    }
}
