package chapter6;

public class Tv {
    String color;
    int channel;
    boolean power;

    void power() {
        power = !power;
    }
    void channelUp() {
        channel++;
    }
    void channelDown() {
        channel--;
    }
}
