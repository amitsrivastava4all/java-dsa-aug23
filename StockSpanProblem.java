import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        int stocks [] = {100,75, 65, 70,65, 75, 85};
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int spanDays = 0;
        for(int i = 1; i<stocks.length; i++){
            while(!stack.isEmpty() && stocks[stack.peek()]<=stocks[i]){
                stack.pop();
            }
            spanDays = stack.isEmpty()?i+1:i-stack.peek();
            System.out.print(spanDays+" ");
            stack.push(i);
        }


        // 
        // // output         1, 1, 1, 2, 1, 5 , 6
        // // Traverse all the stock prices one by one
        // for(int i =0 ; i<stocks.length; i++){
        //     int spanDays = 1;
        //     for(int j= i-1; j>=0 && stocks[j]<=stocks[i]; j--){
        //         spanDays++;
               
        //     }
        //     System.out.print(spanDays+" ");
        // }

    }
}
