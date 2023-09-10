public class SumOfOddAndEvenDigit {

    static int[] sumOfEvenOdd(int num){
        // when i create an array
        // array will be created once.
        // Termination case (Runs only once)
        // this is the time to create an array
        if(num == 0){
            // [0,0]
            int result[] = new int[2]; // even result and odd result
            return result;
        }

        int arr[] = sumOfEvenOdd(num/10); // make the number small
        //when i fill an array
        // get the digit
        int digit = num%10;
        if(digit%2==0){
            arr[0] = arr[0] + digit;
        }
        else{
            arr[1] = arr[1] + digit;
        }
        return arr;
    }
    static void sumOfEvenOdd(int num, int evenSum, int oddSum){
        // Termination Case
        if(num==0){
            System.out.println("Even Sum "+evenSum+" Odd Sum "+oddSum);
            return ;
        }
        // get the digit
        int digit = num%10;
        if(digit%2==0){
            evenSum = evenSum + digit;
        }
        else{
            oddSum = oddSum + digit;
        }
        sumOfEvenOdd(num/10, evenSum, oddSum);

    }
    public static void main(String[] args) {
        //sumOfEvenOdd(1234, 0, 0);
        int arr[] = sumOfEvenOdd(1234);
        System.out.println("Even sum "+arr[0] +" Odd Sum "+arr[1]);
    }
}
