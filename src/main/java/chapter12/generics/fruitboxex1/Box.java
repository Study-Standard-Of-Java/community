package chapter12.generics.fruitboxex1;


import java.util.ArrayList;

class Fruit				  { public String toString() { return "Fruit";}}
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
class Toy		          { public String toString() { return "Toy"  ;}}

class FruitBoxEx1 {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(100000000);
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy>   toyBox   = new Box<Toy>();
//        Box<Fruit> box = new Box<Apple>(); //상속관계여도 타입은 일치해야 한다.
//		Box<Grape> grapeBox = new Box<Apple>(); // 에러. 타입 불일치

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple()); // OK. void add(Fruit item)

        appleBox.add(new Apple());
        appleBox.add(new Apple());
//		appleBox.add(new Toy()); // 에러. Box<Apple>에는 Apple만 담을 수 있음

        toyBox.add(new Toy());
//		toyBox.add(new Apple()); // 에러. Box<Toy>에는 Apple을 담을 수 없음

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    }  // main의 끝
}

public class Box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item)  { list.add(item); }
    T get(int i)      { return list.get(i); }
    int size() { return list.size(); }
    public String toString() { return list.toString();}
}