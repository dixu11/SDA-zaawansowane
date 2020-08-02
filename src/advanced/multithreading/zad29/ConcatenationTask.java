package advanced.multithreading.zad29;

public class ConcatenationTask implements Runnable{

    private int counter;
    private String text;
    private String result ="";
    private Thread thread = new Thread(this);
    private boolean running = false;

    public ConcatenationTask(int counter, String text) {
        this.counter = counter;
        this.text = text;
    }

    public void startTask() {
        running = true;
        thread.start();
    }

    public void abort() {
        running = false;
    }

    @Override
    public void run() {
        for (int i = 0; i < counter; i++) {
            result += text;
            if (!running) {
                System.out.println("Aborted!");
                return;
            }
        }
    }

    public String getResult() {
        return result;
    }
}
