package chapter2;

public class SwapTest {

    private final double PI = 3.14; //상수 사용처

    public static void main(String[] args) {
        int x=10, y=20;
        int tmp;
        tmp=x;
        x=y;
        y=tmp;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

//        WrapperType wrapperType1; 이렇게도 가능

        WrapperType wrapperType = new WrapperType(); //WrapperType 이라는 클래스를 타입으로 사용
        wrapperType.IamWrapper();
    }
}
