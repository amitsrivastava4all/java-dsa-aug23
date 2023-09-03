/*
 * When Function call itself. It creates a Cycle (Loop), we 
 * need to stop this cycle at certain point.
 * to stop the cycle we need put the termination case or base case
 * if u not stop this cycle it will goes infinite and
 * it gives u stackoverflowerror
 */
public class RecursionDemo {

    // 1 to N Numbers print
    static void show(int n){
        // termination case or base case
        if(n==0){
            return ;
        }
        // Recursion Cycle (Loop)
        show(n-1); // stack build (Stack Push)
        // Stack Pop (this line will run after return)
        System.out.println(n); // Processing Logic


    }

    public static void main(String[] args) {
        int n = 5;
        show(n);
    }
}
