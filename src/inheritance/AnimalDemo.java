package inheritance;

public class AnimalDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.fetch();
        dog.feed();

        Cat cat = new Cat();
        cat.meow();
        cat.scratch();
        cat.feed();

    }
}
