package chapter11.comparator;

import java.util.Comparator;

public class FirstClass implements Comparable<FirstClass>, Comparator<FirstClass> {

    private String name;
    private int age;

    public FirstClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public FirstClass() {
    }

    @Override
    public int compareTo(FirstClass o) {
        return this.age - o.age;
        // 나이 대신 사용할 경우 오버, 언더 플로우 조심!
    }

    public static void main(String[] args) {
        FirstClass one = new FirstClass("gyoung", 25);
        FirstClass two = new FirstClass("giii", 24);
        int i = one.compareTo(two);
        if (i > 0) {
            System.out.println("one이 더 큼");
        } else if (i == 0) {
            System.out.println("같다");
        } else {
            System.out.println("one이 더작다");
        }
        int compare = one.compare(one, two);
    }

    @Override
    public int compare(FirstClass o1, FirstClass o2) {
        return o1.age - o2.age;
    }
}
