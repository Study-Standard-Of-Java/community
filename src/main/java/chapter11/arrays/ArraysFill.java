package chapter11.arrays;

import java.util.Arrays;

public class ArraysFill {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Arrays.fill(arr, 3);
        for (int i : arr) {
            System.out.println("i = " + i);
        }

        Arrays.setAll(arr, i -> (i + 1) * 2);
        for (int i : arr) {
            System.out.println("i = " + i);
        }
    }
}
