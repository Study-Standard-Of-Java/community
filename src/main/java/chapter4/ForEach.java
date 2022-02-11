package chapter4;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);

        for (Integer number : list) {
            System.out.println("number = " + number);
        }
    }
}
