package oop.garden;

public class Bramka {

    private boolean otwarta = true;


    public void zamknij(){
        otwarta = false;
    }

    public void otworz(){
        otwarta = true;
    }

    @Override
    public String toString() {
        return "Bramka{" +
                "otwarta=" + otwarta +
                '}';
    }
}
