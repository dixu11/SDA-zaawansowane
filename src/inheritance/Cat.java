package inheritance;

public class Cat extends Pet {

    public Cat() {
        name = "Filemon";
        age = 2;
    }

    public void feed() {
        System.out.println(name + " eats cat fish");
    }


    public void meow() {
        System.out.println("Meow meow!");
    }

    public void scratch() {
        System.out.println(name + " scratches chair");
    }
}
