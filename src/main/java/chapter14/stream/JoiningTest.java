package chapter14.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class JoiningTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("123", "444", "555"));
        String collect = strings.stream().collect(Collectors.joining(",","[","]"));
        System.out.println("collect = " + collect);
    }
}
