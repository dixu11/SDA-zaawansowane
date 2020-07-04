package oop.inheritance;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, age);
    }

  /*  public Cat() {
        super("Filemon", 2);
    }*/

    public void feed() {
//        super.feed();
        System.out.println(name + " eats cat fish");
    }

    public void run(){
        System.out.println("Cat running silently");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow!");
    }

    public void scratch() {
        System.out.println(name + " scratches chair");
    }

    @Override
    public void zrobSztuczke() {
        System.out.println("Wskakuje na lodówkę z podłogi");
    }
}
