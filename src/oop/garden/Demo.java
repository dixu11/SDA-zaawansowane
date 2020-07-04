package oop.garden;

public class Demo {
    public static void main(String[] args) {
        Drzewo d1 = new Drzewo();
        Drzewo d2 = new Drzewo();
        Drzewo d3 = new Drzewo();
        Drzewo[] drzewa = {d1, d2, d3};


        Ogrod ogrod = new Ogrod(drzewa);
        System.out.println(ogrod);
        ogrod.zamknijBramke();
        ogrod.podlejWszystkieDrzewa();
        System.out.println(ogrod);

        //podlanie ostatniego drzewa
        ogrod.getDrzewa()[2].podlej();
        ogrod.podlejWybraneDrzewo(3);


    }
}
