package advanced.java8.stream.streamTask2;

import java.util.Objects;
import java.util.Random;

public class Pet {
    private String name;
    private int age;

    public Pet(String name) {
        this.name = name;
        age = new Random().nextInt(15)+1;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                Objects.equals(name, pet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }
}
