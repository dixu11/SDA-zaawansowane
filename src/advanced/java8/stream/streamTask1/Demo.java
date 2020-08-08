package advanced.java8.stream.streamTask1;

/*
* Stream
Przygotuj ArrayList z 10 liczbami z przedziału 0-100.
za pomocą metody forEach wyświetl wszystkie liczby
za pomocą streama posortuj liczby i wyświetl posortowane
za pomocą streama odfiltruj liczby nieparzyste i policz ile pozostało elementów funkcją kończącą count()
za pomocą streama odfiltruj wszystkie liczby powyżej 50, pozostałe liczby zbierz do nowej listy
za pomocą streama posortuj liczby malejąco a następnie pobierz pierwszą z nich metodą findFirst
*/


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(10, 23, 45, 67, 23, 45, 67, 34, 99,1));
        numbers.forEach(number -> System.out.println(number));
        System.out.println("----");
        numbers.stream()
                .sorted()
                .forEach(number -> System.out.println(number));
        System.out.println("----");

        int count = (int)  numbers.stream()
                .filter(number -> number % 2 == 0)
                .count();
        System.out.println(count);

        System.out.println("----");

        List<Integer> filtered = numbers.stream()
                .filter(number -> number <= 50)
                .collect(Collectors.toList());
        System.out.println(filtered);

        int maxNumber = numbers.stream()
                .sorted((num1, num2) -> num2 - num1)
                .findFirst()
                .orElse(-1);

        System.out.println(maxNumber);












    }
}