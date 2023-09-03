public class SumOfDigit {

    static int sumOfDigit(int num){
        //Termination case
        if(num ==0){
            return  0 ;
        }
        int sum = sumOfDigit(num/10);
        int digit = num % 10;
        return sum + digit;
    }

    //int sum = 0;
    static void sumOfDigit(int num, int sum){
        // Termination Case
        if(num ==0 ){
            System.out.println(sum);
            return ;
        }
        //int sum =0;
        // Processing Logic
        int digit = num % 10; 
        sum = sum + digit;
        // small problem + Recursion Cycle
        sumOfDigit(num/10, sum); // Tail Recursion

    }
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        sumOfDigit(num, sum);
    }
}
