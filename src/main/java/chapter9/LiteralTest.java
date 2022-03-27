package chapter9;

public class LiteralTest {
    public static void main(String[] args) throws InterruptedException {
        String s1 = "aaa";
        String s2 = "aaa";
        String s3 = "aaa";

        System.out.println(s1==s2);

        Integer a = 1000;
        Integer b = 1000;

        System.out.println("System.identityHashCode(a) = " + System.identityHashCode(a));
        System.out.println("System.identityHashCode(b) = " + System.identityHashCode(b));

        System.out.println(a==b);

        Double d1 = 10.2;
        Double d2 = 10.2;

        System.out.println(d1==d2);

        Class<Circle> class1 = Circle.class;
        Class<Circle> class2 = Circle.class;
        System.out.println(class1==class2);

        Boolean check = true;

        System.out.println("check = " + check);


//        Thread.sleep(10000000);

        System.out.println("finish");

    }
}
