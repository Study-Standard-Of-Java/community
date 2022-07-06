package chapter14.stream;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReducingTest {
    public static void main(String[] args) {
        IntStream limit = new Random().ints(1, 45).distinct().limit(6);
        Optional<Integer> collect = limit.boxed().collect(Collectors.reducing(Integer::max));

    }
}
