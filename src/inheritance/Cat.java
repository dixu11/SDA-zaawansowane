package inheritance;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, age);
    }

  /*  public Cat() {
        super("Filemon", 2);
    }*/

    public void feed() {
        super.feed();
        System.out.println(name + " eats cat fish");
    }


    public void meow() {
        System.out.println("Meow meow!");
    }

    public void scratch() {
        System.out.println(name + " scratches chair");
    }
}
