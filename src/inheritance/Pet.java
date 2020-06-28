package inheritance;

public abstract class Pet {
    protected String name;
    protected int age;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void feed();

    public abstract void run();

}
