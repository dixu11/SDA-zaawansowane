package advanced.java8.stream.mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonService {

    private List<Person> people = new ArrayList<>();

    public void add(Person person){
        people.add(person);
    }


    public List<String> getNames() {
       return people.stream()
                .map(person -> person.getName())
                .collect(Collectors.toList());
    }

    public int getTotalCashOfAllPeople(){
        return people.stream()
                .mapToInt(person -> person.getCash())
                .sum();
    }

    public double getAverageCashOfPerson() {
        return people.stream()
                .mapToInt(person -> person.getCash())
                .average()
                .orElse(-1);
    }

























    public Optional<Person>findPersonWithShortestNameWithFor(){
        people.sort((person1, person2) -> person1.getName().length() - person2.getName().length());
        if (people.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(people.get(0));
    }

    public Optional<Person> findPersonWithShortestName(){
      return   people.stream()
                .sorted( (person1, person2) -> person1.getName().length() - person2.getName().length() )
                .findFirst();
    }

    @Override
    public String toString() {
        return "PersonService{" +
                "people=" + people +
                '}';
    }
}
