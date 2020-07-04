package exceptions.zadanie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {

    /*
Bezpośrednio w ścieżce projektu stwórz plik “ksiazki.txt” w pliku tym wypisz conajmniej 3 tytuły książek dot.
programowania które czytasz lub zamierzasz przeczytać. Napisz program który wyświetla wszystkie tytuły w tym
pliku wykorzystując Scanner a w razie braku pliku wyświetla komunikat, że masz się zabrać za czytanie :)

Przygotuj klasę FileDbConnection, w której umownie zasymulujemy połączenie z bazą danych.
 Wywołanie metody connect ma ustawiać stan bazy na połączony, jednak ma istnieć 25% szans na to że połączenie się nie
 powiedzie i zostanie rzucony Twój własny wyjątek FileDbConnectionException.

Stwórz również metodę umożliwiającą pobranie danych z bazy (jako działanie tej metody wykorzystaj wcześniej przygotowane czytanie pliku z książkami) wynik zwracaj jako String lub List<String> .
Jeśli brakuje plików lub plik tekstowy jest pusty należy również rzucić wyjątek FileDbConnectionException z odpowiednią wiadomością.
Zaimplementuj również metodę “disconnect” zmieniający stan obiektu na nie połączony. Wywołaj tę metodę w bloku finally w main.
    * */

    public static void main(String[] args) {
        FileDbConnection connection = new FileDbConnection();
      try{
          connection.connect();
          String data = connection.readFileData();
          System.out.println(data);
      } catch (FileDbConnectionException e){
          System.out.println(e.getMessage());
      }finally {
          connection.disconnect();
      }
        System.out.println("Połączenie zamknięte: " + connection.isConnected());

    }
}
