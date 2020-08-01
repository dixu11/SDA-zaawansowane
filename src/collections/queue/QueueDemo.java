package collections.queue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


public class QueueDemo {

    public static void main(String[] args) {
        //FIFO
//        Queue<String> names =new LinkedBlockingQueue<>(3);
        Queue<String> names =new ArrayBlockingQueue<>(3);
        names.add("Wojtek");
        names.add("Daniel");
        names.add("Ania");
        names.add("Gosia");
        System.out.println(names.remove());
        System.out.println(names.remove());
        System.out.println(names.element());
        System.out.println(names.remove());
        System.out.println(names.remove());
        System.out.println(names.element());

        //add, element remove -> rzucają wyjątki
        names.offer("Wojtek");
        names.offer("Daniel");
        names.offer("Ania");
        names.offer("Gosia");

        System.out.println(names);

        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.peek());



    }


}
