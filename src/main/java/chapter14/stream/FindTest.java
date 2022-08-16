package chapter14.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("bb","abc", "bbb", "ccc", "ddd"));
        for (int i = 0; i < 200000000; i++) {
            list.add("ab");
        }
        long start = System.currentTimeMillis();
        list.stream().parallel()
                .filter(s -> s.length() > 2)
                .findAny()
                .ifPresent(System.out::println);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();

        list.stream().parallel()
                .filter(s -> s.length() > 2)
                .findFirst()
                .ifPresent(System.out::println);

        end = System.currentTimeMillis();
        System.out.println(end - start);

        list.stream()
                .filter(s -> s.length() > 2)
                .findAny()
                .ifPresent(System.out::println);

        list.stream()
                .filter(s -> s.length() > 2)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
