package advanced.java8.stream.streamTask2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Objects;

public class Person {

    private String name;
    private LocalDate birthdate;
    private List<Pet> pets;

    public Person(String name, LocalDate birthdate, List<Pet> pets) {
        this.name = name;
        this.birthdate = birthdate;
        this.pets = pets;
    }

    public int getAge() {
       return (int) birthdate.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public List<Pet> getPets() {
        return pets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(pets, person.pets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pets);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", pets=" + pets +
                '}';
    }
}
