package Chpater6;

public class TvTest {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.channel=5;
        t.power=true;

        t.channelDown();
        t.power();
        System.out.println("t.channel = " + t.channel);
        System.out.println("t.power = " + t.power);

        StaticMethod staticMethod = new StaticMethod();
        staticMethod.add(5,3);
        StaticMethod.minus(3,2);
    }
}
