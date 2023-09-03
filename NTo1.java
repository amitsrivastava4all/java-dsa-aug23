/*
 * 5
 * 4
 * 3
 * 2
 * 1
 */
public class NTo1 {
    static void show(int n){
        // Termination Case
        if(n==0){
            return ;
        }
        System.out.println(n); // Processing Logic
        // small problem (n-1) + Recursion (Cycle)
        show(n-1); // Tail Recursion
    }
    public static void main(String[] args) {
        int n = 5;
        show(n);
    }
}
