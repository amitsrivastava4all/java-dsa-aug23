import java.util.LinkedList;
import java.util.Queue;

class Stack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public Stack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int ele) {
        queue1.add(ele);
    }

    public int pop() {
        if (queue1.isEmpty()) {
            return -1;
        }

        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        int poppedElement = queue1.poll();
        Queue<Integer> helper = queue1;
        queue1 = queue2;
        queue2 = helper;
        return poppedElement;
    }

    public int peek() {
        if (queue1.isEmpty()) {
            return -1;
        }

        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        int poppedElement = queue1.poll();
        Queue<Integer> helper = queue1;
        queue1 = queue2;
        queue1.add(poppedElement);
        queue2 = helper;
        return poppedElement;
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }

}

public class StackUsingQueue {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());
        stack.push(40);
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

}
