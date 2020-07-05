package collections.sets;

import java.util.Objects;

//klasa
public class User {
    //pola - cechy
    private String name; // enkapsulacja / hermetyzacja
    private int age;

    //konstruktory - przygotowanie obiektu (konstrukcja)
   /* public oop.user.User(String newName, int newAge) {
        name = newName;
        age = newAge;
    }*/

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(){
        name = "Jan";
        age = 18;
    }

    //metody - zachowania
    public void makeBirthday() {
        age++;
    }

    //    wartość zwracana      (parametry przyjmowane  )
    public int howManyYearsTo(int age) {
        int period = age - this.age;
        return period;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void print() {
        System.out.println("Imie: " + name + " wiek: " + age);
    }

   // @Override
    public String toString(){
        return "Imie: " + name + " wiek: " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
//Ada -> 33
//Zenon -> 190
// Wojtek -> 40
//[Ada, Wojtek] [] [] [Zenon] []
