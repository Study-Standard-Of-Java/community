package chapter14.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;

interface MyFunction {
    public abstract int max(int a, int b);
}


public class LambdaTest {
    public static void main(String[] args) {
        MyFunction function = new MyFunction() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        int big = function.max(5, 3);

        MyFunction f = (int a, int b) -> a > b ? a : b;
        f.max(5, 3);

        List<String> list = Arrays.asList("123", "abd", "aba", "456");
        list.sort((s1, s2) -> s1.compareTo(s2));
    }
}
