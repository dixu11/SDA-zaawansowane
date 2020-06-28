package inheritance;

public class Pet {
    protected String name;
    protected int age;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void feed(){
        System.out.println("It's time to eat!");
    }
}
