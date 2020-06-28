package inheritance;

public class Pet {
    protected String name;
    protected int age;

    public Pet() {
        name = "";
        age = 1;
    }

    public void feed(){
        System.out.println(name + " eats its food");
    }
}
