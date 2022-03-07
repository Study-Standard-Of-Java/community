package chapter5;

public class ArrayException {
    public static void main(String[] args) {

        int[] score = new int[5];
        /**
         * ArrayIndexOutOfException 발생!!
         */
        for (int i = 0; i <= 5; i++) {
            score[i]=i;
        }

    }
}
