package advanced.multithreading.stopingThreads;

public class SpammerDemo {
    public static void main(String[] args) throws InterruptedException {
        Spammer spammer = new Spammer();
        spammer.startTask();
        Thread.sleep(1000);
        spammer.stop();

    }
}
