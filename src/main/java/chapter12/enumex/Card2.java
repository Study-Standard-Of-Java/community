package chapter12.enumex;

public class Card2 {
    public Card2(Kind kind, Value value) {
        this.kind = kind;
        this.value = value;
    }

    enum Kind { CLOVER, HEART, DIAMOND, SPADE }
    enum Value { TWO, THREE, FOUR }

    final Kind kind;
    final Value value;
}
