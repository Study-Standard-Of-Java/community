package chapter14.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> str = Optional.empty();
        String orElse = str.orElse("null str");
        System.out.println("orElse = " + orElse);

        Optional<String> optVal = Optional.of("test");
        String s = optVal.get();
        System.out.println("s = " + s);

        str.orElseGet(String::new);
//        str.orElseThrow(RuntimeException::new);

        List<String> list = new ArrayList<>(Arrays.asList("test", "2", "str", "no"));
        list.stream()
                .filter(s1 -> s1.length() < 2)
                .findAny()
                .ifPresent(System.out::println);
    }
}
