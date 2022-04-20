package chapter11.arrays;

import java.util.Arrays;

public class ArraySortSearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        int i1 = Arrays.binarySearch(arr, 1);
        System.out.println("i1 = " + i1);

        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println("i = " + i);
        }
        int i = Arrays.binarySearch(arr, 1);
        System.out.println("i = " + i);
    }
}
