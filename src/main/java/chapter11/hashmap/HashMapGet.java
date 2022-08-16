package chapter11.hashmap;

import java.util.HashMap;

public class HashMapGet {
    public static void main(String[] args) {
        HashMap<Long, Float> map = new HashMap<>();
        map.put(1L, 2.0f);
        map.put(2L, 2.0f);
        map.put(3L, 2.0f);
        map.put(3L, 5.0f);

        Float s = map.get(4L);
        System.out.println("s = " + s);

        map.put(4L, null);
        try {
            System.out.println("map.get(4L) = " + map.get(4L));
            map.put(4L, map.get(4L) + 4.0f);

            System.out.println("map.get(4L) = " + map.get(4L));
        } catch (NullPointerException e) {
            throw new RuntimeException("런타임");
        }

    }
}
