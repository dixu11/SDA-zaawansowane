package advanced.java8.interfaces;

//Stosując gotowe klasy interfejsów funkcyjnych (Function, Consumer, Supplier,
// Comparator, Predicate) zaimplementuj i przetestuj 5 funkcje:
//funkcja przyjmująca tekst i zwracająca jego długość
//funkcja sprawdzająca czy przekazany tekst ma minimum 5 znaków
//funkcja dostarczająca losową liczbę z przedziału 1-10
//funkcja drukująca tekst wielkimi literami
//funkcja porównująca dwa teksty po ilości liter

import java.util.Comparator;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesDemo {
    public static void main(String[] args) {
        Function<String, Integer> getLength = text -> text.length();
        System.out.println(getLength.apply("abcd"));

        Predicate<String> test = text -> text.length() >= 5;
        System.out.println(test.test("abcd"));

        Supplier<Integer> generateRandomValue =() ->  {
                Random random = new Random();
            return random.nextInt(10) + 1;
        };
        System.out.println(generateRandomValue.get());

        Comparator<String> compareByLength = (s1, s2) -> s1.length() - s2.length();
        System.out.println(compareByLength.compare("b","aaaa"));

    }
}
