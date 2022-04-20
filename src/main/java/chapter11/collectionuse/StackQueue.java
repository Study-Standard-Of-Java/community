package chapter11.collectionuse;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue q = new LinkedList();

        stack.push("1");
        System.out.println("stack.empty() = " + stack.empty());

        stack.pop(); //삭제

        q.offer(1);
        System.out.println("q.isEmpty() = " + q.isEmpty());
        q.poll(); //삭제

    }
}
