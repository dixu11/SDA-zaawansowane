package random;

import java.util.Random;

public class RandomDemo {
    private static String[] names = new String[]{
            "Albert",
            "Bartek",
            "Dima",
            "Dorian",
            "Izabela",
            "Karolina",
            "Krzysztof",
            "Kuba",
            "Łukasz",
            "Marcin Lewandowski",
            "Marcin Madrzyk",
            "Mateusz",
            "Piotr",
            "Przemek",
    };

    public static void main(String[] args) {
        int numbersPeople = names.length;
        Random random = new Random();
        System.out.println(names[random.nextInt(numbersPeople)]);
    }

}
