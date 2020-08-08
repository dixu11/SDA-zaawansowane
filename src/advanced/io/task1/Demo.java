package advanced.io.task1;

/*
Stwórz obiekt Product z polami name(string), price(double) oraz amount(int).
        Przygotuj prosty serwis, który przyjmie listę produktów oraz zapisze je do pliku products.csv. Jedna linia pliku
        to jeden obiekt.
        Przygotuj metodę która odczyta z pliku zapisane linie i odtworzy z nich listę obiektów. Wykorzystaj klasy
        BufferedReader oraz FileReader.
        Przygotuj klasę Order, która będzie zawierać listę produktów oraz imię zamawiającego.
        Przygotuj klasę OrderSaver, która za pomocą metody saveOrders(List<Order>) zapisze do pliku “orders.bin”
        serializowaną wersję obiektu
        Przygotuj klasę OrderLoader która będzie posiadała analogiczną funkcjonalność wczytującą serializowane obiekty
        dla chętnych: połącz obie implementacje w jeden obiekt Serializator, zdolny zapisywać i odczytywać dowolny obiekt.
         Zastosuj typy generyczne.
*/


import java.util.List;

public class Demo {

    public static void main(String[] args) {
      /*  Product p1 = new Product("Maszyna do ćwierkania", 100,2);
        Product p2 = new Product("Pralka", 2000, 5);

        ProductsCsvSaver saver = new ProductsCsvSaver("products.csv");
        saver.saveProducts(List.of(p1,p2));
*/

        //Maszyna do ćwierkania,100,2
        //Pralka,2000,5
        ProductsCsvLoader loader = new ProductsCsvLoader("products.csv");
        List<Product> products = loader.loadProducts();

        System.out.println(products);


    }


}
