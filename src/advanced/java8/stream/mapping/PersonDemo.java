package advanced.java8.stream.mapping;

/*Stwórz prosty obiekt Person zawierający pole name oraz prostą metodę hello(). Stwórz klasę PersonService która będzie
        przechowywać osoby, zaimplementuj w tym celu metodę add(Person). Dodaj kilka osób a następnie zaimplementuj metodę
        findPersonWithShortestName().
        Metoda ma dostarczać obiekt Person. Ponieważ chcemy uniknąć zwracania wartości null - zastosuj typ zwracany
        Optional<Person>. W mainie przetestuj dwa scenariusze, w jednym otrzymałeś pusty optional a w drugi faktyczny obiekt.
        Wywołaj metodę hello() zabezpieczając się w dowolny sposób przed błędem spowodowanym zwróceniem pustego optionala.*/


import java.util.List;
import java.util.Optional;

public class PersonDemo {
    public static void main(String[] args) {
        List<String> names = List.of("Ala", "Ala","Aga", "Ania", "Adam",
                "Zenek", "Janina","Wojtek");

        PersonService service = new PersonService();

        names.stream()
                .map(name -> new Person(name))
                .forEach(person -> service.add(person));


        System.out.println(service);
        System.out.println(service.getTotalCashOfAllPeople());
        System.out.println(service.getAverageCashOfPerson());

        // System.out.println(service.getNames());








    }
}
