package collections.builderMethods;

import java.time.LocalDate;

public class BuilderMethodDemo {

    public static void main(String[] args) {

        Person person1 = Person.buildCustomPerson("Radek", 30);
        Person person2 = Person.buildRandomPerson();
        Person person3 = Person.buildDefaultPerson();

        person2 = person2.changeName("Wiesław");
        System.out.println(person2);

        //person2 = null;

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        person1.sayHello();
        Person.staticMethod();

//        LocalDate data = new LocalDate(2001, 7, 9);
        LocalDate data2 = LocalDate.of(2001, 7, 9);
        System.out.println(data2);
        int liczba1 = 123456;
        int liczba2 = 0123456;
        int liczba3 = 0xabcd23;
        int liczba4 = 0b01011010101;
        System.out.println(liczba1);
        System.out.println(liczba2);
        System.out.println(liczba3);
        System.out.println(liczba4);

        LocalDate dateAfter2Weeks = data2.plusWeeks(2);
        System.out.println(data2);
        System.out.println(dateAfter2Weeks);


    }


}
