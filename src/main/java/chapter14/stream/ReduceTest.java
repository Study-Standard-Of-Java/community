package chapter14.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("str", "test", "1", "niceee"));
        list.stream()
                .reduce((s, s2) -> {
                    System.out.println("s = " + s);
                    System.out.println("s2 = " + s2);
                    return s + s2;
                })
                .ifPresent(System.out::println);

        String identity = list.stream()
                .reduce("identity", (s, s2) -> s + s2);
        System.out.println("identity = " + identity);

        ArrayList<String> objects = new ArrayList<>();
        String identity1 = objects.stream()
                .reduce("identity", (s, s2) -> s + s2);
        System.out.println("identity1 = " + identity1);

    }
}
