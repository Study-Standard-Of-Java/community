package chapter12.enumex;

enum Transportation {
    BUS(100), TRAIN(150), SHIP(100), AIRPLANE(300);

    private final int BASIC_FARE;

    Transportation(int BASIC_FARE) {
        this.BASIC_FARE = BASIC_FARE;
    }

    int fare() {
        return BASIC_FARE;
    }
}
