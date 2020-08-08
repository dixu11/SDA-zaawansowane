package advanced.java8.stream.optionalTask;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("Hi, my name is " + name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
