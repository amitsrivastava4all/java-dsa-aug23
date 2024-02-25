public class LargestRectAreaInHistro {
    public static void main(String[] args) {
        int arr[] = {6,2,5,4,5,6};
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            int currentBar = arr[i];
            // left bar
            for(int j = i-1; j>=0; j--){
                if(arr[j]>arr[i]){
                    currentBar+=arr[i];
                }
                else{
                    break;
                }
            }
            // right bar
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    currentBar+=arr[i];
                }
                else{
                    break;
                }
            }
            max = Math.max(max, currentBar);
        }
        System.out.println("max Area "+max );
    }
}
