package Recursion;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(30);
        myStack.push(40);
        System.out.println("Before POP : " + myStack);
        myStack.pop();
        System.out.println("After POP operation " + myStack);
        myStack.push(50);
        myStack.push(60);
        System.out.println("Stack is " + myStack);
        System.out.println(myStack.peek());
        System.out.println(myStack.isEmpty());
    }
}

