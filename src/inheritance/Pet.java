package inheritance;

public abstract class Pet implements ZwierzeDomowe{
    protected String name;
    protected int age;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void feed();

    public abstract void run();

    public abstract void makeSound();

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
