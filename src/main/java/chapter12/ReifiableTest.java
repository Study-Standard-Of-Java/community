package chapter12;

import java.util.*;

public class ReifiableTest {

    @SafeVarargs
    public static <T extends String> List<T> addAllElement(T... items) {
        return new LinkedList<>(Arrays.asList(items));
    }

    public static <T> boolean addAllElement2(Collection<? super T> c, T... items) {
        LinkedList<T> ts = new LinkedList<>(List.of(items));
        return true;
    }

    public static void main(String[] args) throws InterruptedException {

        List<String> list = new ArrayList<>();
        list.add("Hi");

        Object[] array = new Long[10];
        array[0] = 1L;

        addAllElement("15", "string");
        Thread.sleep(1000000);
        System.out.println("success");

    }
}
