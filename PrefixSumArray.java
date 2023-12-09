public class PrefixSumArray {
    public static void main(String[] args) {
        int arr[] = {3,6,2,8,1, 4,1,5};
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        System.out.println("Org Array");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Prefix Array");
        for(int i = 0; i<prefix.length; i++){
            System.out.print(prefix[i]+" ");
        }
        System.out.println();
        System.out.println("Range Query");
        int lowerBound = 3;
        int upperBound = 6;
        System.out.println("Sum "+(prefix[upperBound] - prefix[lowerBound-1]));
    }
}
