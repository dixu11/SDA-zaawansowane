package collections.builderMethods;

import java.util.Objects;
import java.util.Random;

public class Person {

    private static final String[] names = {"Edyta","Izabela","Kuba"};
    private final String name;
    private final int age;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Person buildCustomPerson(String name, int age) {
        return new Person(name,age);
    }

    public static Person buildRandomPerson() {
        Random random = new Random();
        return new Person(names[random.nextInt(names.length)],random.nextInt(20)+18);
    }

    public static Person buildDefaultPerson() {
        return new Person("Jan", 18);
    }

    public Person changeName(String name) {
        return new Person(name, age);
    }

    public void sayHello() {
        System.out.println("I'am " + name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void staticMethod() {
        System.out.println("Welcome in Person class!");
    }
}
