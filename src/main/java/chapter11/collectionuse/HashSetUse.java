package chapter11.collectionuse;

import java.util.HashSet;

public class HashSetUse {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("hashSet");
        hashSet.add("JAVA");
        for (String s : hashSet) {
            System.out.println(s);
        }
        System.out.println("hashSet.contains(\"JAVA\") = " + hashSet.contains("JAVA"));

    }
}
