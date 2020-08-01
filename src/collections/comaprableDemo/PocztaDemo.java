package collections.comaprableDemo;

public class PocztaDemo {
    public static void main(String[] args) {
        Poczta poczta = new Poczta();
        poczta.add(new Przesylka("Maja", RodzajPrzesylki.LIST, 2));
        poczta.add(new Przesylka("Kuba", RodzajPrzesylki.PRZEKAZ, 0));
        poczta.add(new Przesylka("Dima", RodzajPrzesylki.PACZKA, 100));

        System.out.println(poczta.getPrzesylki());
    }
}
