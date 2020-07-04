package oop.user;

public class Demo {

    public static void main(String[] args) {
        int liczba = 10;
        User user = new User("Marcin", 20);
        System.out.println(user);

        User user2 = new User("Zofia",30);
        System.out.println(user2);
        user2.makeBirthday();
        System.out.println(user2);
        System.out.println(user2.getAge());
        int result = user2.howManyYearsTo(40);
        System.out.println(user2.howManyYearsTo(40));
        System.out.println(result);
    }
}
