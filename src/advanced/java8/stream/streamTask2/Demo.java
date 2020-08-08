package advanced.java8.stream.streamTask2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Puszek");
        Pet pet2 = new Pet("Reksio");
        Pet pet3 = new Pet("Gonzo");
        Pet pet4 = new Pet("Fractal");

        Person person1 = new Person("Anna", LocalDate.of(1999,2,3), new ArrayList<>());
        Person person2 = new Person("Adam",LocalDate.of(2010,2,3), List.of(pet1));
        Person person3 = new Person("Artur",LocalDate.of(2005,2,3), List.of(pet2,pet3,pet4));

        List<Person> people = List.of(person1, person2, person3);
        people.stream()
                .map(person -> person.getName())
                .sorted()
                .forEach(name -> System.out.println( name));

        double averageAge = people.stream()
                .mapToInt(person -> person.getAge())
                .average()
                .orElse(-1);

        System.out.printf("Sredni wiek: %.2f\n",  averageAge);

        List<Pet> pets = people.stream()
                .flatMap(person -> person.getPets().stream() )  //Stream<Person>  -> Stream<List<Pet>>
                .collect(Collectors.toList());

        System.out.println(pets);


        double averageAge2 = people.stream()
                .flatMap(person -> person.getPets().stream())
                .mapToInt(pet -> pet.getAge())
                .average()
                .orElse(-1);

        System.out.println(averageAge2);







    }
}
