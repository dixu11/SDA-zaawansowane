package exceptions.zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Team {

    private List<Person> people = new ArrayList<>();

    public void add(Person person) {
        people.add(person);
    }

    public Person findPersonById(int id){
        for (Person person : people) {
            if (person.getId() == id) {
                return person;
            }
        }
        throw new NoSuchElementException("Nie znaleziono osoby o ID: " + id);
    }


    @Override
    public String toString() {
        return "Team{" +
                "people=" + people +
                '}';
    }
}
