package chapter12.generics;

import chapter7.Car;

public class Util {
    public static <T> Box<T> boxing(T data) {
        Box<T> box = new Box<>();
        box.set(data);
        return box;
    }

    public static <T> void boxing2(T data) {

    }

    public static void main(String[] args) {
        Car car = new Car();
        Box<Car> boxing = boxing(car);
        Car car1 = boxing.get();
    }
}
