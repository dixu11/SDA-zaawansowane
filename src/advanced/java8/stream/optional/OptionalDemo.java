package advanced.java8.stream.optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        NameService service = new NameService();
      Optional<String> textOptional = service.findNameByNameFragment("lasdsd");

      textOptional.ifPresent(text -> System.out.println(text.toUpperCase()));

      /*  if (textOptional.isPresent()) {
            String text = textOptional.get();
            System.out.println(text.toUpperCase());
        }*/


        String text = service.findNameByNameFragment("lasdsd ")
                .orElse("");

        String text2 = service.findNameByNameFragment("lasdsd ")
                .orElseThrow(() ->   new IllegalArgumentException("Podałeś tekst po którym nic nie znaleźliśmy"));

        System.out.println("Pusty?" + text.isEmpty());




    }
}
