import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
    public static void main(String[] args) {
       // 2 Ways to use Java Queue
    //    Queue<Integer> queue = new LinkedList<>(); 
    Queue<Integer> queue = new ArrayDeque<>(); 
       queue.offer(100);
       queue.offer(200);
       queue.offer(300);
       System.out.println(queue.peek()); // front
      int temp =  queue.poll();
      System.out.println(temp);
      System.out.println(queue.peek());
    }
}
