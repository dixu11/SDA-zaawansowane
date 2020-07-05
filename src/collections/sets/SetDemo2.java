package collections.sets;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        User user = new User();
        User user2 = new User("Ola",33);
        User user3 = new User("Wojtek",44);
        User user4 = new User("Ania",50);
        User user5 = new User("Ola",33);


        Set<User> users = new HashSet<>();
        users.add(user);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);


        for (User iteratedUser : users) {
            System.out.println(iteratedUser);
        }
    }
}
