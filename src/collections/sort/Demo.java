package collections.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Zenek");
        names.add("Zofia");
        names.add("Ania");
        names.add("Adam");
        names.add("Ola");
        names.add("Krzysztof");
        System.out.println(names);

        /*class MyComparator implements Comparator<String>{
            @Override
            public int compare(String text1, String text2) {
                if (text1.length() > text2.length()) {
                    return 1; // z przodu
                } else if (text1.length() < text2.length()) {
                    return -1; // z tyłu
                } else {
                    return 0; //ta sama pozycja
                }
            }
        }*/

//        StringLengthComapartor myComparator = new StringLengthComapartor();

        names.sort(new Comparator<>() {
            public int compare(String text1, String text2) {
                return text1.length() - text2.length();
            }
        });
        // Collections.sort(names); //metoda nie wymaga Comparatora
        System.out.println(names);


    }
}
