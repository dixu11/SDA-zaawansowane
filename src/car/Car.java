package car;

public class Car {

    private String brand;
    private int mileage;
    private int service = 10_000;

    public Car(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    public void print(){
        System.out.println("marka: " + brand +
                " przebieg: " +mileage);
    }

    public void drive(int distance){
//        mileage = mileage + distance;
        mileage += distance;
    }

    public int howManyToService(){
        return service - mileage;
    }



   /* public String toString(){
       return  "marka: " + brand +
                " przebieg: " +mileage;
    }*/

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
