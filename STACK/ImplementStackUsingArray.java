package Recursion;

class Stack{
    private int top, capacity;
    private int stackArray[];

   public Stack(int maxCapacity){
    this.capacity = maxCapacity;
    this.stackArray = new int[maxCapacity];
    this.top = -1;
   }

   public void push(int element){
    if(top < capacity-1){
        stackArray[++top] = element;
        System.out.println("Element Pushed In Stack : " + element);
    }
    else{
        System.out.println("Stack Overflow Occured");
    }
   }

   public int pop(){
    if(top >= 0) {
        int element = stackArray[top--];
        System.out.println("Element Popped From Stack : " + element);
        return element;
   }
   else{
        System.out.println( "Stack Underflow Occured" );
        return -1;
   }

    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public void printStack(){
        if(isEmpty()){
            System.out.println( "The Stack Is Empty" );
            return;
        }
        else{
            for(int i=top;i>=0;i--){
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    // isFull()
    // getSize()
    // peek()
}
public class ImplementStackUsingArray{
    public static void main(String[] args) {
        Stack myStack = new Stack(5); // Creating a stack of size 5
        
        myStack.push(34);            // Adding elements to the stack
        myStack.push(76);                        
        myStack.push(-29);                        
        myStack.push(89);
        myStack.printStack();
        myStack.pop() ;                           // Removing an element from the stack
        myStack.printStack();
        myStack.pop();
        myStack.printStack();
    }
}