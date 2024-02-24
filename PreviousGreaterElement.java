import java.util.Stack;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        int arr[] = {10,4,2,20,40,12,30};
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        System.out.print("-1");
        for(int i = 1; i<arr.length; i++){
            // remove smaller element
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            int pge = stack.isEmpty()?-1:stack.peek();
            System.out.print(pge+" ");
            stack.push(arr[i]);
        }
        /* *
        int arr[] = {10,4,2,20,40,12,30};
        for(int i = 0 ; i<arr.length; i++){
            int j;
            for( j = i -1; j>=0; j--){
                if(arr[j]>arr[i]){
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
            if(j==-1){
                System.out.print("-1"+" ");
            }
        }
        */
    }
}
