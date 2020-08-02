package advanced.multithreading.zad29;

//Stwórz klasę ConcatenationTask w której będziemy X razy kopiować ten sam tekst. Tzn. tworząc i uruchamiając
// ConcatenationTask
// z parametrami: 3 oraz “D” wynikiem pracy wątku powinno być “DDD” zapisane w polu result.
//Zadanie powinno być możliwe do rozpoczęcia po wywołaniu metody startTask()
//Zadbaj o to, aby zadanie można było przerwać za pomocą metody abort()
//w mainie za pomocą anonimowej klasy stwórz i uruchom inny wątek który przerwie zadanie z poprzedniego wątku
// po sekundzie
//W mainie na koniec zaprezentuj ile znaków ma wynik konkatenacji. Przetestuj scenariusz w którym ustawiasz
// tyle razy doklejanie tekstu aby trwało to dłużej niż sekundę i upewnij się, że Twoja metoda abort() działa poprawnie.

public class ConcatenationDemo {
    public static void main(String[] args) throws InterruptedException {
        ConcatenationTask task = new ConcatenationTask(100_000, "D");
        task.startTask();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                task.abort();
            }
        });
        thread.start();
        thread.join();
        System.out.println(task.getResult().length());
    }
}
