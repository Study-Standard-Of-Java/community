package chapter7;

public interface PlayingCard {
    public static final int SPADE = 4;
    final int DIAMOND = 3;
    static int HEART = 2;
    int CLOVER = 1;

    public abstract String getCardNumber();
    String getCardKind();

    static int testStaticMethod() {
        return 2;
    }



    default void print() {

    }
}