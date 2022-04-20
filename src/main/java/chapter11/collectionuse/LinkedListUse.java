package chapter11.collectionuse;

import java.util.LinkedList;

public class LinkedListUse {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("15");
        list.add("최근영");
        list.add(1,"중간");

        for (String s : list) {
            System.out.println("s = " + s);
        }

        list.remove(0);
        System.out.println();

        for (String s : list) {
            System.out.println("s = " + s);
        }
    }
}
