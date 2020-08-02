package advanced.multithreading.stopingThreads;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Osobny wątek!");
                }
            }
        });
        thread.start();
       // Thread.sleep(1000);
        thread.join();
        System.out.println("Wątek wykonał 100 wyświetleń");
    }
}
