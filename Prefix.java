public class Prefix {
    public static void main(String[] args) {
        int arr[] = {7,1,4,3,2};
        int pre[] = new int[arr.length];
        pre[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
           pre[i] =  pre[i-1] + arr[i];
        }
        int low = 0;
        int upper = 4;
        if(low==0){
            System.out.println(pre[upper]);
            return;
        }
        System.out.println(pre[upper] - pre[low-1]);
    }
}
