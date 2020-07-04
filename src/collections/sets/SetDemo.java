package collections.sets;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> wylosowaneLiczby = new HashSet<>();
        wylosowaneLiczby.add(4);
        wylosowaneLiczby.add(22);
        wylosowaneLiczby.add(44);
        wylosowaneLiczby.add(7);
        wylosowaneLiczby.add(13);
        wylosowaneLiczby.add(20);
        wylosowaneLiczby.add(7);
        System.out.println(wylosowaneLiczby);

        if (wylosowaneLiczby.contains(13)) {
            System.out.println("A to pech...");
        }

        for (Integer liczba : wylosowaneLiczby) {
            System.out.println(liczba);
        }

        //int pierwszaLiczba = wylosowaneLiczby.get(0);



        //Set przechowują tylko unikatowe wartości
        //Wartości są nieuporządkowane

    }
}
