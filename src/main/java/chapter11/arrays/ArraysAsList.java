package chapter11.arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        List<String> strings = Arrays.asList(new String[]{"ab", "cd"});

    }
}
