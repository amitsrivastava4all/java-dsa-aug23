import java.util.Stack;

class Queue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public Queue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();

    }

    public void enqueue(int ele) {
        stack1.push(ele);
    }

    public int dequeue() {
        if (stack1.isEmpty()) {
            return -1;
        }

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int removedElement = stack2.pop(); 
             
        return removedElement;
    }

}

public class QueueUsingStack {
    public static void main(String[] args) {

    }

}
