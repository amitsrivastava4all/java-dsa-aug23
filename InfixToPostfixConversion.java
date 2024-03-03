public class InfixToPostfixConversion {

    static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;

            default:
                return 0;
        }
    }

    static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }

        }
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();

    }

    public static void main(String[] args) {
        String infix = "a+b*c-(d/e+f)*g";
        String postfix = infixToPostfix(infix);
        System.out.println("The postfix String is " + postfix);
    }

}
