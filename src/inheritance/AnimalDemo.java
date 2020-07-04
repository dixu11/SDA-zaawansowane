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
        //cat.meow();
        cat.scratch();
        cat.feed();
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(dog);
        pets.add(dog2);
        pets.add(cat);
        System.out.println("------");
        PetAssistant assistant = new PetAssistant();
        assistant.feedPets(pets);

        RobotFabryczny robotFabryczny = new RobotFabryczny();
        PiesRobot piesRobot = new PiesRobot();
        System.out.println("---");
        ArrayList<ZwierzeDomowe> zwierzetaDomowe = new ArrayList<>();
        zwierzetaDomowe.add(piesRobot);
        zwierzetaDomowe.add(dog);
        zwierzetaDomowe.add(cat);

        for (ZwierzeDomowe zwierzeDomowe : zwierzetaDomowe) {
            zwierzeDomowe.zrobSztuczke();
        }




    }
}
