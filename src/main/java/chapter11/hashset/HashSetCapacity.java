package chapter11.hashset;

import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HashSetCapacity {
    public static void main(String[] args) throws NoSuchFieldException {
        HashSet<Integer> hashSet = new HashSet<>();
        Map<Object, Object> objectObjectMap = Collections.synchronizedMap(new HashMap<>());
        Hashtable<Object, Object> objectObjectHashtable = new Hashtable<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            objectObjectMap.put(i, 10);
        }
        long end = System.currentTimeMillis();
        System.out.println(start - end);

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            objectObjectHashtable.put(i, 10);
        }
        long end1 = System.currentTimeMillis();
        System.out.println(start1 - end1);
    }
}
