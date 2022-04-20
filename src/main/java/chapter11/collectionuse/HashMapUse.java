package chapter11.collectionuse;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapUse {
    public static void main(String[] args) {
        HashMap<Long, String> map = new HashMap<>();

        map.put(1L, "member1");
        map.put(2L, "member3");
        boolean result = map.containsKey(1L);
        System.out.println(result);

        Set<Map.Entry<Long, String>> entries = map.entrySet();
        for (Map.Entry<Long, String> entry : entries) {
            System.out.println("entry.getValue() = " + entry.getValue());
        }

        map.values().stream()
                .map(s -> "entry.getValue() = " + s)
                .forEach(System.out::println);

        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println("value = " + value);
        }

        Set<Long> longs = map.keySet();
        longs.stream()
                .map(aLong -> "aLong = " + aLong)
                .forEach(System.out::println);



    }
}
