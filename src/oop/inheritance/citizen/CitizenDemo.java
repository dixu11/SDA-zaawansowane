package oop.inheritance.citizen;

/*
* Stwórz klasę abstrakcyjną Citizen oraz klasy dziedziczące:
Peasant(Chłop),
Townsman(Mieszczanin),
King(Król),
Soldier(Żołnierz)
Wszystkie klasy posiadają pole imie (przemyśl gdzie powinno się znajdować to pole).
* Citizen powinien być klasą abstrakcyjną która posiada metodę abstrakcyjną 'canVote'
* która zwraca true dla townsman'a i soldier'a, ale false dla chłopa i króla.

Stwórz klasę Town która posiada zbiór obiektów typu Citizen.
* Dodaj do niej kilku citizenów (tworząc ich w main). Obiekt klasy Town ma mieć metody:
howManyCanVote -  które zwracają ilość osób które mogą głosować
whoCanVote -  która wypisuje imiona osób które mogą głosować

*
* */

public class CitizenDemo {
    public static void main(String[] args) {

        Citizen citizen = new Peasant();
        Citizen citizen2 = new Soldier();
        Citizen citizen3 = new King();
        Citizen citizen4 = new Townsman();

//        System.out.println(oop.inheritance.citizen.canVote());
//        System.out.println(citizen2.canVote());

        Town town = new Town();
        town.add(citizen);
        town.add(citizen2);
        town.add(citizen3);
        town.add(citizen4);

        System.out.println(town);

        System.out.println(town.howManyCanVote());


    }
}












