class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class Stack<T> {
    private Node<T> top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;

        }
        System.out.println("Successfully Pushed");
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Underflow Condition");
        }
        T poppedData = top.data;
        top = top.next;
        return poppedData;

    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        return top.data;

    }

}

public class LinkedListImplementationOfStack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.peek());
        st.push(8);
        st.push(9);
        st.pop();
        System.out.println(st.peek());

    }

}