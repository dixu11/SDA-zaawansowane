package oop.exceptions.zadanie2;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class TeamController {

    private Team team = new Team();

    public TeamController() {
        Person person1 = new Person("Radek");
        Person person2 = new Person("Magda");
        Person person3 = new Person("Ola");

        team.add(person1);
        team.add(person2);
        team.add(person3);
    }

    public void findAndPrintPerson() {
        int id = getId();
        printPersonOfId(id);
    }

    private int getId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Osobę z którym ID chcesz wyświetlić?");
        return scanner.nextInt();
    }

    private void printPersonOfId(int id) {
        try {
            Person person = team.findPersonById(id);
            System.out.println(person);
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
    }

}
