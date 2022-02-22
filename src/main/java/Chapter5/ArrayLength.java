package Chapter5;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class ArrayLength {
    public static void main(String[] args) {
        int[] score = new int[6];
//        score = new int[5];
        for (int i = 0; i < score.length; i++) {
            score[i] = i + 500;
        }

        HashMap<Long, String> info = new HashMap<>();
        Hashtable<Long, String> info2 = new Hashtable<>();
        info.put(1L, "최근영");
        info2.put(1L, "최근영");
    }
}
