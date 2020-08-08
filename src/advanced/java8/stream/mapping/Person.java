package advanced.java8.stream.mapping;

import java.util.Random;

public class Person {

    private String name;
    private int cash;

    public Person(String name) {
        this.name = name;
        cash = new Random().nextInt(100);
    }

    public void hello() {
        System.out.println("Hi, my name is " + name);
    }

    public String getName() {
        return name;
    }

    public int getCash() {
        return cash;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cash=" + cash +
                '}';
    }
}
