package chapter12.generics;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Box<T> {
    T data;

    public T get() {
        return data;
    }

    public void set(T data) {
        this.data = data;
    }
}