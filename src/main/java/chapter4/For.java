package chapter4;

public class For {
    public static void main(String[] args) {
        for(int i=0,  j=0; i<10 && j<5; i+=2, j++){
            System.out.println(i);
            System.out.println(j);
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
