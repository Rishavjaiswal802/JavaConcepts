import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueUsage {
    public static void main(String[] args) {
        Queue<Integer> queue= new PriorityQueue<>();
        queue.add(23);
        queue.add(2342);
        queue.add(234234);
        queue.add(265324);
        queue.add(236656);
        queue.add(2433453);
        System.out.println(queue.element());
        

    }
}
