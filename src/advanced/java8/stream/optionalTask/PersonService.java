package advanced.java8.stream.optionalTask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class PersonService {

    private List<Person> people = new ArrayList<>();

    public void add(Person person){
        people.add(person);
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
