package chapter11.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        List<String> strings = Arrays.asList(new String[]{"ab", "cd"});

        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list.toString());
        list.add(1,"5");
        System.out.println(list.toString());
    }
}
