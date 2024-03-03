public class EvaluateExpression {

    static int performOperation(char c, int operand1, int operand2) {
        switch (c) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 != 0) {
                    return operand1 + operand2;
                }
                throw new ArithmeticException("Division By 0");

            default:
                throw new IllegalArgumentException("Invalid Arguments");
        }
    }

    static int evaluate(String expression) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stack.push(c - '0');
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation(c, operand1, operand2);
                stack.push(result);
            }
        }
        return stack.pop();

    }

    public static void main(String[] args) {
        String expression = "133*+4-";
        int result = evaluate(expression);
        System.out.println("The Answer of this Expression  is " + result);
    }

}
