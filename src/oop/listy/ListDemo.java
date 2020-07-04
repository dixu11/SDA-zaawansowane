package oop.listy;

import java.util.ArrayList;
import java.util.Arrays;

public class ListDemo {
    public static void main(String[] args) {
        String[] animals = new String[5];
        animals[0] = "dog";
        animals[1] = "cat";
        animals[2] = "cow";
        animals[3] = "lion";
        System.out.println(animals.length);

        ArrayList<String> animalsList = new ArrayList<>();
        animalsList.add("dog");
        animalsList.add("cat");
        animalsList.add("cow");
        animalsList.add("lion");

        System.out.println(animalsList.size());
        System.out.println(animalsList);

        for (String animal : animalsList) {
            System.out.println(animal);
        }

        System.out.println(animalsList.get(1));
        animalsList.remove(0);
        System.out.println(animalsList);
        animalsList.remove("cow");
        System.out.println(animalsList);

        ArrayList<String> otherAnimals = new ArrayList<>(Arrays.asList("elephant","tiger"));

        animalsList.addAll(otherAnimals);
        System.out.println(animalsList);

        if (animalsList.contains("tiger")) {
            System.out.println("Uciekać!");
        }
    }












}
