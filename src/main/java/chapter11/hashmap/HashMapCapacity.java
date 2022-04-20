package chapter11.hashmap;

import java.lang.reflect.Field;
import java.util.HashMap;

public class HashMapCapacity {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        HashMap<Object, Object> m = new HashMap<>();
        m.put(3, 3);
        Field f1 = m.getClass().getDeclaredField("loadFactor");
        f1.setAccessible(true);
        System.out.println("f1 = " + f1.get(m));

        Field f2 = m.getClass().getDeclaredField("threshold");
        f2.setAccessible(true);

        int currentLoadFactor = (int) f2.get(m);
        System.out.println("currentLoadFactor = " + currentLoadFactor);
    }
}
