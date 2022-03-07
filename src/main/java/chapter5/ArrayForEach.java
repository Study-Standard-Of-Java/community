package chapter5;

public class ArrayForEach {
    public static void main(String[] args) {
        int[][] score = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("score.length = " + score.length);
        System.out.println("score[0].length = " + score[0].length);
        for (int[] tmp : score) {
            for (int num : tmp) {
                System.out.println("num = " + num);
            }
        }
    }
}
