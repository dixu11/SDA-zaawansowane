package collections.comaprableDemo;

public class Przesylka implements Comparable<Przesylka> {

    private String adresat;
    private RodzajPrzesylki rodzaj;
    private int waga;

    public Przesylka(String adresat, RodzajPrzesylki rodzaj, int waga) {
        this.adresat = adresat;
        this.rodzaj = rodzaj;
        this.waga = waga;
    }

    @Override
    public String toString() {
        return "Przesylka{" +
                "adresat='" + adresat + '\'' +
                ", rodzaj=" + rodzaj +
                ", waga=" + waga +
                '}';
    }

    @Override
    public int compareTo(Przesylka innaPrzesylka) {
        return innaPrzesylka.waga - waga;
    }
}
