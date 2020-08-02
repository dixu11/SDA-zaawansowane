package advanced.multithreading.sync;

import java.util.concurrent.atomic.AtomicInteger;

public class TaskAtomic {

    private AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        counter.addAndGet(1);
    }
    public int getCounter() {
        return counter.get();
    }
}