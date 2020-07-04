package oop.car;

public class CarDemo {

    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car car = factory.createCarFromScanner();
        ServiceAnalyzer analyzer = new ServiceAnalyzer();
        analyzer.printCarServiceState(car);





       /* Car car1 = new Car("Fiat",1000);
        Car car2 = new Car("BMW",2000);

//        car1.print();
//        car2.print();

        System.out.println(car1);
        System.out.println(car2);

        car1.drive(50);
        car2.drive(100);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println("Do serwisu dla samochodu "
                + car1.getBrand() + " zostało " + car1.howManyToService()+
                "km");

        System.out.println("Do serwisu dla samochodu "
                + car2.getBrand() + " zostało " + car2.howManyToService()+
                "km");*/

    }


}
