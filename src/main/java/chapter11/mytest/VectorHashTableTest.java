package chapter11.mytest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class VectorHashTableTest {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>(Collections.synchronizedList(arrayList));

        long beforeTime = System.currentTimeMillis();

        for (int i = 0; i < 100000000; i++) {
            vector.add(new Random().nextInt(9));
        }

        long afterTime = System.currentTimeMillis();

        System.out.println("벡터 시간차이:" + (afterTime - beforeTime));


        long beforeTime2 = System.currentTimeMillis();

        for (int i = 0; i < 100000000; i++) {
            arrayList1.add(new Random().nextInt(9));
        }

        long afterTime2 = System.currentTimeMillis();

        System.out.println("리스트 시간차이:" + (afterTime2 - beforeTime2));

    }
}
