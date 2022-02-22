package Chapter5;

public class ArrayDeclare {
    public static void main(String[] args) {

        int score[];
        score = new int[3];
        System.out.println("score = " + score);

        for (int i = 0; i < 3; i++) {
            score[i]=i;
        }
        int arr[];
        arr= new int[4];
        for (int i = 0; i < 3; i++) {
            arr[i] = score[i];
        }

    }
}
