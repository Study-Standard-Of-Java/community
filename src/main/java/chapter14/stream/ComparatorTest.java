package chapter14.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Compare implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        return car1.grade - car2.grade;
    }
}
class Car {
    public String wheel;
    public int grade;

    public Car(String wheel, int grade) {
        this.wheel = wheel;
        this.grade = grade;
    }

    public String getWheel() {
        return wheel;
    }

    public int getGrade() {
        return grade;
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
        Car car1 = new Car("123", 2);
        Car car2 = new Car("345", 5);
        Car car3 = new Car("222", 1);
        Car car4 = new Car("423", 3);

        ArrayList<Car> list = new ArrayList<>(Arrays.asList(car1, car2, car3, car4));

        list.stream().sorted(Comparator.comparing(Car::getGrade, Comparator.naturalOrder())
                .thenComparing(new Compare()))
                .forEach(car -> System.out.println(car.wheel));
        System.out.println("---------------");

        list.stream().sorted(Comparator.comparing(Car::getWheel))
                .forEach(car -> System.out.println(car.wheel));
    }
}
