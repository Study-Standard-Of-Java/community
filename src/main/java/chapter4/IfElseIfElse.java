package chapter4;

public class IfElseIfElse {
    public static void main(String[] args) {
        int score=70;
        if (score > 70) {
            System.out.println("합격");
        } else if (score > 60) {
            System.out.println("재시험");
        }else{
            System.out.println("불합격");
        }
    }
}
