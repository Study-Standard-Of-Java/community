package chapter9;

import java.util.StringJoiner;

public class JoinTest {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");
        String result = String.join("-", arr);
        System.out.println("result = " + result);

        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (String s : arr) {
            sj.add(s.toUpperCase());
        }
        System.out.println("sj.toString() = " + sj.toString());
    }
}
