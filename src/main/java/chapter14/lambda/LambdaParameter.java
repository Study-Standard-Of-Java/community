package chapter14.lambda;

public class LambdaParameter {
    public static void main(String[] args) {
        MyFunction2 f = () -> System.out.println("myMethod()");
        aMethod(f);
        aMethod(() -> System.out.println("direct"));
    }

    public static void aMethod(MyFunction2 function2) {
        System.out.println("function2 = ");
        function2.myMethod();
        System.out.println("function2 = " + function2);
    }
}
