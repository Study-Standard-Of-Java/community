package chapter4;

public class IfEx {
    public static void main(String[] args) {
        int score = 65;
        if(score>60){
            System.out.println("합격");
            System.out.println("좋아요");
        }

        if(score>60)
            System.out.println("안에서 실행");
            System.out.println("바깥에서 실행");

    }
}
