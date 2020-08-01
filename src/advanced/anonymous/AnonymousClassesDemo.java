package advanced.anonymous;

import java.util.ArrayList;
import java.util.List;

public class AnonymousClassesDemo {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();
        Computer gamingComputer = new Computer(){

            private int memory;

           /* public Computer(){

            }*/

            @Override
            public void start() {
                System.out.println("Gaming computer starts fast");
                System.out.println(getClass().getName());
            }
        };

        List<Computer> computers = new ArrayList<>();

        computers.add(computer1);
        computers.add(computer2);
        computers.add(gamingComputer);

        for (Computer computer : computers) {
            computer.start();
        }
    }
}
