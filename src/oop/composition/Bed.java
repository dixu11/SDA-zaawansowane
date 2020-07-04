package oop.composition;

public class Bed {

    private boolean made = false;

    public void make(){
        made = true;
    }


    @Override
    public String toString() {
        return "Bed{" +
                "made=" + made +
                '}';
    }
}
