package advanced.java8.stream.optionalTask;

/*Stwórz prosty obiekt Person zawierający pole name oraz prostą metodę hello(). Stwórz klasę PersonService która będzie
        przechowywać osoby, zaimplementuj w tym celu metodę add(Person). Dodaj kilka osób a następnie zaimplementuj metodę
        findPersonWithShortestName().
        Metoda ma dostarczać obiekt Person. Ponieważ chcemy uniknąć zwracania wartości null - zastosuj typ zwracany
        Optional<Person>. W mainie przetestuj dwa scenariusze, w jednym otrzymałeś pusty optional a w drugi faktyczny obiekt.
        Wywołaj metodę hello() zabezpieczając się w dowolny sposób przed błędem spowodowanym zwróceniem pustego optionala.*/


import java.util.Optional;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Marcin");
        Person person2 = new Person("Marian");
        Person person3 = new Person("Maria");
        PersonService service = new PersonService();
        service.add(person1);
        service.add(person2);
        service.add(person3);

        System.out.println(service);

        Optional<Person> personOptional1 = service.findPersonWithShortestName();
        if (personOptional1.isPresent()) {
            personOptional1.get().hello();
        }

        PersonService service2 = new PersonService();
        //service2.add(person2);
        Optional<Person> personOptional2 = service2.findPersonWithShortestNameWithFor();
        personOptional2.ifPresent(person -> person.hello());
    }
}
