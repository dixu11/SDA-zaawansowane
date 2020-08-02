package advanced.java8.interfaces;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        //Supplier - nic nie przyjmuje ale zwraca wartość
        //Consumer - przyjmowanie bez zwracania
        //Function - przyjmowanie i zwracanie
        //Predicate - sprawanie warunku na danych -> zwraca boolean
        //Comparator - przyjmuje 2 rzeczy zwraca inta

        StringConsumer krzykacz = (text) -> System.out.println(text.toUpperCase() + "!");
        krzykacz.consume("sdfsfsdf");

        Consumer<String> krzykacz2 = text -> System.out.println(text.toUpperCase() + "!");
        krzykacz2.accept("sdfsdfsdfssdfsdfsdf");

        List<String> names = List.of("Ala", "Aga", "Ania", "Adam");
      Counter counter = new Counter();

        names.forEach(name -> counter.increment());

        for (String name : names) {
            System.out.println(name);
            counter.increment();
        }

        Predicate<Integer> isPositive = number -> number > 0;
        System.out.println(isPositive.test(100));
    }
}
