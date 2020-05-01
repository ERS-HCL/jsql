package rnd;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class TypeExample {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        MyType1 t1 = getMyType();
        System.out.println(t1);
        
    }

    private static <T> T getMyType() throws InstantiationException, IllegalAccessException {
        List<T> dummy = new ArrayList<>(0);
        Type[] actualTypeArguments = ((ParameterizedType) dummy.getClass().getGenericSuperclass()).getActualTypeArguments();
        Type clazz = actualTypeArguments[0];
        Class<T> theClass = (Class<T>) clazz.getClass();
        System.out.println(theClass);
        return theClass.newInstance();
    }

    static class MyType1 {
        String s="myType1";
        @Override
        public String toString() {
            return s;
        }
    }

    static class MyType2 {

    }

    static interface MyType3 {

    }
}
