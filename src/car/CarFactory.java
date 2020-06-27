package car;

import java.util.Scanner;

public class CarFactory {

    public Car createCarFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaka marka?");
        String brand = scanner.nextLine();
        System.out.println("Jaki przebieg?");
        int mileage = scanner.nextInt();
        return new Car(brand, mileage);
    }
}
