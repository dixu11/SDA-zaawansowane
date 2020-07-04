package collections.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsInJava {

    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Zenek");
        names.add("Zofia");
        names.add("Ania");
        names.add("Adam");
        System.out.println(names);

        //dostosowują rozmiar automatycznie -> przewaga nad tablicami
        //przechowują wartości w zadanej kolejności
        //wartości mogą się powatarzać

    }

    //ArrayList
    //-> 60
    // [3][10][2][-2][40]
    // [3][10][2][-2][40][60][null][null]

    //->40
    //LinkedList
    // 3> 10> 2> -2> 40


}

