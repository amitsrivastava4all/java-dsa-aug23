public class PrimeStore {
    /*
     * 1. Compute Prime Number
     * 2. Count Prime Number
     * 3. Based on Count I create an Array (Size)
     * 4. Fill the Array and Return
     */
    static boolean isPrime(int num, int rem){

        if(num == 1){
            return false;
        }
        
        if(num == rem){
            return true;
        }
        if(num%rem==0){
            return false;
        }
        return isPrime(num, rem+1);
    }
    static int index= 0;
    static int[] storePrime(int range, int count){
        if(range == 0){
            return new int[count];
        }
        boolean result = isPrime(range,2); // Count Call
        int arr[] ;
        if(result){
            arr = storePrime(range-1, count+1);
        }
        else{
        arr = storePrime(range-1, count);
        }
        // Stack Fall
        if(isPrime(range, 2)){ // Store
            arr[index]  = range;
            index++;
        }
        return arr;
    }
    public static void main(String[] args) {
    //    System.out.println( isPrime(17, 2));
    //    System.out.println(isPrime(266, 2));
        final int RANGE = 1000;
        int result[] = storePrime(RANGE, 0);
        for(int r : result){
            System.out.println("Prime Number "+r);
        }
    }
}
