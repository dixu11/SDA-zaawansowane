package advanced.multithreading.intro;

public class ThreadsDemo {
    public static void main(String[] args) {

        Task task = new Task();
        Thread thread = new Thread(task);
        Thread thread2 = new Thread(new Runnable(){
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Pętla wykonywana przez trzeci wątek -> " + i);
                }
            }
        });
        thread.start(); //wywołanie start powoduje zbudowanie osobnej ścieżki programu i uruchomienie na nim 'run()'
        thread2.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("Pętla wykonywana przez main -> " + i);
        }


       // int liczba = 0b1010101101;

    }
}
