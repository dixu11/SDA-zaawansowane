package collections.deque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class MyStackDemo {
    public static void main(String[] args) {
        Deque<String> stos = new LinkedList<>();
        stos.add("Harry Potter");
        stos.add("Dziady");
        stos.add("Diuna");

        System.out.println(stos.pollLast());
        System.out.println(stos.pollLast());
        System.out.println(stos.pollLast());
        System.out.println(stos.pollLast());
        System.out.println(stos.pollLast());
    }
}
