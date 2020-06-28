package cars;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Car {

    private ArrayList<Wheel> wheels;

    public Car(){
        wheels = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Wheel wheel = new Wheel();
            wheels.add(wheel);
        }
    }

    public void punctureRandomWheel(){
        Random random = new Random();
        int randomIndex = random.nextInt(wheels.size());
        Wheel wheelToPuncture =  wheels.get(randomIndex);
        wheelToPuncture.puncture();
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                '}';
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }


}
