package garden;

import java.util.Arrays;

public class Ogrod {

    private Bramka bramkaWejsciowa = new Bramka();
    private Lawka[] lawki; // wstawia sie domysnie 2 lawki
    private Drzewo[] drzewa; // tworzac ogrod nalezy wstawic dowolna ilosc drzew

    public Ogrod(Drzewo[] startoweDrzewa){
        Lawka lawka = new Lawka();
        Lawka lawka2 = new Lawka();
        Lawka[] tablicaLawek = {lawka,lawka2 };
        lawki = tablicaLawek;
        drzewa = startoweDrzewa;
    }

    public void zamknijBramke() {
        bramkaWejsciowa.zamknij();
    }

    public void podlejWszystkieDrzewa() {
        for (Drzewo drzewo : drzewa) {
            drzewo.podlej();
        }
    }


    @Override
    public String toString() {
        return "Ogrod{" +
                "bramkaWejsciowa=" + bramkaWejsciowa +
                ", lawki=" + Arrays.toString(lawki) +
                ", drzewa=" + Arrays.toString(drzewa) +
                '}';
    }

    public Drzewo[] getDrzewa() {
        return drzewa;
    }

    public void podlejWybraneDrzewo(int numerDrzewa){
        drzewa[numerDrzewa-1].podlej();
    }

}
