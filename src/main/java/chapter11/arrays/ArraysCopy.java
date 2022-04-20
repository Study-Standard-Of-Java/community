package chapter11.arrays;

import java.util.Arrays;

public class ArraysCopy {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] copy = Arrays.copyOf(arr, arr.length);
        for (int i : copy) {
            System.out.println("i = " + i);
        }

        System.out.println("next");

        int[] overCopy = Arrays.copyOf(arr, 6);
        for (int i : overCopy) {
            System.out.println("i = " + i);
        }

        int[] copyOfRange = Arrays.copyOfRange(arr, 1, 4);
        for (int range : copyOfRange) {
            System.out.println("range = " + range);
        }
    }
}
