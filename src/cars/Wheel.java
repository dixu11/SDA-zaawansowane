package cars;

public class Wheel {

    private static final double CORRECT_PRESSURE = 2.2;

    private boolean flat = false;
    private double pressure = CORRECT_PRESSURE;

    public void puncture() {
        flat = true;
        pressure = pressure * 0.1;
    }

    public boolean isFlat() {
        return flat;
    }

    public void repair() {
        flat = false;
        pressure = CORRECT_PRESSURE;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "flat=" + flat +
                ", pressure=" + pressure +
                '}';
    }
}
