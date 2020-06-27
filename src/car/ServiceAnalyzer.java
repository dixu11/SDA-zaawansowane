package car;

public class ServiceAnalyzer {


    public void printCarServiceState (Car car){
        int distanceToService = car.howManyToService();
        if (distanceToService > 0) {
            System.out.println("Dla samochodu o marce" + car.getBrand() + " zostało jeszcze " +distanceToService +
                    " kilometrów do przeglądu");
        } else {
            System.out.println("Samochód o marce" + car.getBrand() + " powinien był zrobić przegląd "
                    + Math.abs(distanceToService) + " kilometrów temu!");
        }
    }


}
