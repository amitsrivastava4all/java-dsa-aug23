public class NumberToString {
    static String numbers [] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight","nine"};
    static void printNumberToString(int num){
        // Base Case / Termination Case
        if(num ==0){
            return ;
        }
        // get the single digit
        int digit = num%10;
        // make the number small and do the recursion
        printNumberToString(num/10);
        // Stack Fall
        System.out.print(numbers[digit]+" ");
    }
    public static void main(String[] args) {
        printNumberToString(2024);
        System.out.println();
    }
}
