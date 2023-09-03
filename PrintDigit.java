public class PrintDigit {
    static void printDigit(int n){
        // Termination Case
        if(n==0){
            return ;
        }
       
        // small problem (n/10)
        printDigit(n/10); // Small Problem with Recursion Cycle
        System.out.println(n%10); // Processing Logic
    }
    public static void main(String[] args) {
        int n = 12345;
        printDigit(n);
    }
}
