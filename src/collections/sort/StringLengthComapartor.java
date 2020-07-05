package collections.sort;

import java.util.Comparator;

public class StringLengthComapartor implements Comparator<String> {

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
}
