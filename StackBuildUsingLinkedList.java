class Node{
    // Instance Members
    int data; // default value 0
    Node next; // default value null
    Node(int data){
        this.data = data;
        //this.next = null;
    }
}
class MyStackClass{
    Node top; // default null
    void push(int data){
        Node node = new Node(data);
        node.next = top;
        top = node;
        System.out.println("Element Added...");
  }
  // element at top
  int peek(){
    if(top == null){
        throw new RuntimeException("Stack is Empty....");
    }
    return top.data;
  }

  int pop(){
    if(top == null){
        throw new RuntimeException("Stack is Empty....");
    }
    int data = top.data;
    top = top.next;
    return data;
  }

}
public class StackBuildUsingLinkedList {
    public static void main(String[] args) {
        MyStackClass stack = new MyStackClass();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
