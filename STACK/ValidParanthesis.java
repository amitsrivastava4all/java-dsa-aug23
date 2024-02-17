package STACK;

import java.util.Stack;

public class ValidParanthesis {

    static boolean isValid(String str) {
        Stack<Character> myStack = new Stack();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                // push the character to stack
                myStack.push(ch);
            } 
            else {
                if (myStack.isEmpty()) {
                    return false; // no corresponding opening bracket
                } 
                else if (!isPair(myStack.peek(), ch)) {
                    return false;
                } 
                else {
                    myStack.pop();
                }
            }
        }
        return myStack.isEmpty();
    }

    static boolean isPair(char stackTopElement, char currentElement){
        if((stackTopElement == '(' && currentElement == ')') || (stackTopElement == '{' && currentElement == '}') || (stackTopElement == '[' && currentElement==']')){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        String expression = "{{{()}]}";
        System.out.println("Expression : " + expression);
        System.out.println(isValid(expression));
    }
}
