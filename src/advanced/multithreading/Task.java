package advanced.multithreading;

public class Task implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Pzdr z osobnego wątku! Po raz.. " + i);
        }
    }
}
