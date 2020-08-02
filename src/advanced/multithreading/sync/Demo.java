package advanced.multithreading.sync;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    task.increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    task.increment();
                }
            }
        });

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println(task.getCounter());
    }
}
