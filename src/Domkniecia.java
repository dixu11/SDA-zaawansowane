import java.util.List;
import java.util.stream.Collectors;

public class Domkniecia {


    public static void main(String[] args) {
        List<Osoba> osoby = List.of(new Osoba("Marcin",20),
                new Osoba("Kasia",30),
                new Osoba("Ada",15),
                new Osoba("Daniel",35),
                new Osoba("Zdzisław",40),
                new Osoba("Ola",29),
                new Osoba("Jadzia",17));
      osoby=  usunOsobyPonWiekuIPosortujPoDlugosciImienia(osoby,18);
        System.out.println(osoby);
    }

    public static List<Osoba> usunOsobyPonWiekuIPosortujPoDlugosciImienia(List<Osoba> osobyDoPosortowania, int minWiek){

       return osobyDoPosortowania.stream()
               .filter(osoba -> osoba.getWiek() >= minWiek) // domknięcie wykorzystujące parametr metody
                .sorted( (osoba1, osoba2)-> osoba1.getImie().length() - osoba2.getImie().length()) // zdefiniowanie domknięcia
                .collect(Collectors.toList());
    }

}

class Osoba{

    private String imie;
    private int wiek;

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
