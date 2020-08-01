package collections.collections_poject.part2and3;

import java.util.Map;

public class CountryDemo {

    /*
    * Zmodyfikuj serwis aby przechowywał państwa w formie posortowanej. Sortowaniem domyślnym (natural order)
    * ma być kolejność alfabetyczna wg nazwy. Zastosuj interfejs Comparator. Przetestuj działanie metodą getAll()
    * Przygotuj metody:
getSortedByPopulation() - metoda zwraca państwa posortowane w niestandardowy sposób - wg. populacji. Zastosuj
* własny Comparator
*/

    public static void main(String[] args) {
        CountryService service = new CountryService();

//        service.add(new Country("Kuba"));
//        service.add(new Country("Dania"));
//        service.add(new Country("Kenia"));
//        service.add(new Country("Polska"));
//        service.add(new Country("Wielka Brytania"));
//        service.add(new Country("NIemcy"));
        service.add(new Country("Francja", 9000, "Paryz", "FR"));
        service.add(new Country("Polska", 8000, "Warszawa", "PL"));
        service.add(new Country("Niemcy", 10000, "Berlin", "DE"));
        System.out.println(service.getAll());
        System.out.println(service.getSortedByPopulation());


      /*  Map<String, Country> mapaKrajow = service.createShortcutMap();
        System.out.println(mapaKrajow);
        System.out.println(mapaKrajow.get("PL"));*/



    }
}
