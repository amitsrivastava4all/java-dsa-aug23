import java.util.Scanner;
public class File1 {

    static void print1(Integer arr[][]){
        int n = arr.length; // number of rows
        for (int i=0; i<n; ++i){
            for (int j=0; j<arr[i].length; ++j){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = scan.nextInt();
        System.out.println("Enter number of columns: ");
        int col = scan.nextInt();
        int [][]arr = new int[row][col];
        Integer [][]arr2 = new Integer[row][col];
        print1(arr2);
    
    }
}
