package advanced.multithreading.stopingThreads;

public class AnonymousClassOnThread {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            public void run() {
                System.out.println("Kod z osobnego wątku");
            }
        };

        thread.start();
    }
}
