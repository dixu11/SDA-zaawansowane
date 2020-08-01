package collections.comaprableDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Poczta {

    private Set<Przesylka> przesylki = new TreeSet<>();

    public void add(Przesylka przesylka) {
        przesylki.add(przesylka);
    }

    public Set<Przesylka> getPrzesylki() {
        return przesylki;
    }
}
