package advanced.java8.stream.optional;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class NameService {

   private List<String> names = List.of("Ala", "Ala","Aga", "Ania", "Adam",
            "Zenek", "Janina","Wojtek");

    public Optional<String> findNameByNameFragment(String fragment) {
        for (String name : names) {
            if (name.contains(fragment)) {
                return Optional.of(name);
            }
        }
        return Optional.empty();
    }


    public String findNameByNameFragmentOnStream(String fragment){

        return names.stream()
                .filter(name -> name.contains(fragment))
                .findFirst()
                .orElse("");

    }




}

