package cars;

/*Zadanie 1.
        W programie zrealizuj następujący scenariusz:
        Samochód ma koła, a ich opony mają ustalone ciśnienie i mogą być przebite.
         Warsztat może przyjmować samochód żeby go naprawić.
         W klasie WarsztatDemo stwórz samochód z czterema kołami oraz  warsztat.

         Następnie tworząc i wywołując odpowiednie metody zasymuluj następujące zdarzenia:
        samochód łapie gumę w losowym kole,
        warsztat przyjmuje samochód do naprawy,
        warsztat sprawdza stan kół i wymienia przebite opony,
        warsztat po wykonaniu usługi drukuje ile kół wymienił i ile będzie to kosztowało.*/


public class CarsDemo {

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        car.punctureRandomWheel();
        car.punctureRandomWheel();
        System.out.println(car);

        Garage garage = new Garage();
        String raport = garage.repairAndRaport(car);
        System.out.println(raport);
        System.out.println(car);

    }

}
