package Chpater6;

public class StaticMethod {
    public int add(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
//        int add = add(3, 5); static 메서드에서는 클래스내의 인스턴스 메서드 호출불가
        return a - b;
    }

    public int divide(int a, int b) {
        int result = add(a, b);
        return result / a / b;

    }

}
