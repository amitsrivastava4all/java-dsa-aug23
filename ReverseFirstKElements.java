import java.util.LinkedList;
import java.util.Queue;

public class ReverseFirstKElements {
    static Queue<Integer> reverseFirstKElements(Queue<Integer> queue, int k) {
        if (queue == null || k < 0 || k > queue.size()) {
            System.out.println("Can not Reverse elements");
            return null;
        }
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.poll());
        }

        return queue;

    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        int k = 3;
        Queue<Integer> ans = reverseFirstKElements(queue, k);
        for (Integer element : queue) {
            System.out.print(element + " ");
        }
    }
}