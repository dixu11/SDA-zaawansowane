package exceptions.zadanie2;

public class Person {

    private int id;
    private String name;
    private static int nextId = 0;

    public Person( String name) {
        id = nextId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
