package collections.collections_poject;

/*
Stwórz program służący do przeglądania statystyk na temat państw.
        Przygotuj klasę CountryDemo do testowania swojego serwisu
         oraz CountryService jako klasę przechowującą informacje
          o państwach, pozwalającą dodawać je i usuwać oraz
          pobierać dane na ich temat.

        Uwaga, serwis nie powinien komunikować swojego działania
        za pomocą wydruków w konsoli. Jest to funkcjonalność
        przewidziana dla innej części aplikacji której twórca
        sam zdecyduje jak będzie zbierał do niej dane i
        co zrobi z pobranymi wynikami.
        Naszym zadaniem jest tylko dostarczenie
        odpowiednich metod i sprawdzenie w mainie czy działają :)

        Przygotuj pierwszą wersję aplikacji w której państwa będą
         przechowywane jako zbiór obiektów typu String.
         Zaopatrz serwis w następujące metody:

        add(String) pozwalająca dodać państw
        remove(String) pozwalająca usunąć państwo
        getAll() zwracająca List<String> państw na bazie setu
        findByExactName(String) zwracająca państwo po jego nazwie
        findByName(String) zwracająca listę państw do których pasuje wpisany ciąg znaków np. “nia” zwróci listę z obiektami: “Bośnia”, “Kenia” oraz “Dania”
*/


public class CountryDemo {
    public static void main(String[] args) {
        CountryService service = new CountryService();
        service.add("Kuba");
        service.add("Dania");
        service.add("Kenia");
        service.add("Niemcy");
        service.add("Polska");
        service.add("Wielka Brytania");

        System.out.println(service);
        service.remove("Kuba");
        System.out.println(service);
        System.out.println("---");
        System.out.println(service.getAll());

        System.out.println(service.findByExactName("Kenia"));
        System.out.println(service.findByExactName("kenia"));

        System.out.println(service.findByName("ska"));
        System.out.println(service.findByName("nia"));





    }
}
