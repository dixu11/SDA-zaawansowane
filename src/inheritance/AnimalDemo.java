package inheritance;

import java.util.ArrayList;

public class AnimalDemo {
    public static void main(String[] args) {
       // Pet hamster = new Pet("Johny", 1);
       // hamster.feed();



        Pet dog = new Dog();
//        dog.bark();
//        dog.fetch();
        dog.feed();

        Pet dog2 = new Dog("Bruno", 6);

        Cat cat = new Cat("Grażyna", 11);
        cat.meow();
        cat.scratch();
        cat.feed();
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(dog);
        pets.add(cat);
        System.out.println("------");
        PetAssistant assistant = new PetAssistant();
        assistant.feedPets(pets);

    }
}
