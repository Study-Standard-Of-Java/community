package chapter14.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MatchTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("str", "test", "1", "niceee"));
        boolean match = list.stream()
                .allMatch(s -> s.length() >= 1);
        System.out.println("match = " + match);

        boolean match1 = list.stream().noneMatch(String::isEmpty);
        System.out.println("match1 = " + match1);

        Optional<String> any = list.parallelStream()
                .filter(s -> s.length() >= 1)
                .findAny();
        System.out.println("any.get() = " + any.get());
    }
}
