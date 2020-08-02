package advanced.multithreading.sync;

public class Task {

    private int counter = 0;

    public synchronized void increment() {
        /*int myCounter = counter;
        int result = myCounter +1;
        counter = result;*/
        counter++;
    }
    public int getCounter() {
        return counter;
    }
}
