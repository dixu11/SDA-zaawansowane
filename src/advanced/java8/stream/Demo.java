package advanced.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {

        List<String> names = List.of("Ala", "Ala","Aga", "Ania", "Adam",
                "Zenek", "Janina","Wojtek");

        List<String> tylkoNaA = new ArrayList<>();

        for (String name : names) {
            if (name.startsWith("A")) {
                tylkoNaA.add(name);
            }
        }
        Collections.sort(tylkoNaA);
        for (String name : tylkoNaA) {
            System.out.println(name);
        }
        System.out.println("------");

        names.stream()
                .filter(name -> name.startsWith("A"))
                .sorted()
                .forEach(name -> System.out.println(name));

      long count =   names.stream()
                .distinct()
                .count();

        System.out.println(count);

     List<String> shortNames=   names.stream()
                .filter(name -> name.length()<=3)
                .collect(Collectors.toList());

        System.out.println(shortNames);





    }

}
