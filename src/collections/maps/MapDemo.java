package collections.maps;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<>();
        users.put(1, "Marcin");
        users.put(2, "Daniel");
        users.put(3, "Wojtek");
        users.put(4, "Ewa");
        users.put(5, "Zofia");
        users.put(1, "Ala");
        users.put(6, "Ewa");


        System.out.println(users);
        System.out.println(users.get(3));
        for (Integer key : users.keySet()) {
            System.out.println(key + " -> " + users.get(key));
        }

        for (String value : users.values()) {
            System.out.println(value);
        }

        for (Map.Entry<Integer, String> entry : users.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println(users.getOrDefault(5, "Brak"));

        System.out.println(czyDodatnia(10));
        System.out.println(czyDodatnia(-10));

    }

    public static String czyDodatnia(int liczba){
       return liczba >0 ? "dodatnia" : "ujemna";
    }
}
