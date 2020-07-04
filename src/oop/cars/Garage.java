package oop.cars;

import java.util.ArrayList;

public class Garage {

    private static final double PRICE = 20;

    public String repairAndRaport(Car car) {
       int wheelsRepaired = executeRepair(car);
        return generateRaport(wheelsRepaired);
    }

    private int executeRepair(Car car){
        int wheelsRepaired = 0;
        ArrayList<Wheel> wheelsToRepair = car.getWheels();
        for (Wheel wheel : wheelsToRepair) {
            if (wheel.isFlat()) {
                wheel.repair();
                wheelsRepaired++;
            }
        }
        return wheelsRepaired;
    }

    private String generateRaport(int wheelsRepaired) {
        return "Naprawiono " + wheelsRepaired + " kół. Należy się: " + wheelsRepaired * PRICE + "zł";
    }


}
