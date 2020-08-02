package advanced.multithreading.stopingThreads;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Spammer implements Runnable{

    private Thread runner = new Thread(this);
    private boolean running = true;

    @Override
    public void run() {
        //LocalTime startTime = LocalTime.MAX.now();
        for (int i = 0; i < 1_000_000; i++) {
            System.out.println("SPAM nr "+ i);
            if (!running) {
                return;
            }
        }
        //System.out.println("End time: " + startTime.until(LocalTime.now(), ChronoUnit.MILLIS));
    }

    public void startTask() {
        runner.start();
    }

    public void stop() {
        running = false;
    }
}
