import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        System.out.println("Enter Range");
        int n= new Scanner(System.in).nextInt();
       // O(N)

        for(int i = 1; i<=n; i++){

        }
        // O(1)
        for(int i = 1; i<=10; i++){

        }
        // Log N
        for(int i = 2; i<=n; ){
            i = (int)Math.pow(i,i);
        }
        // N/2
        for(int i = 1; i<=n;i++,n--){

        }
        // O(N)
        for(int i = 1; i<=n; i++){
            // Log N
            for(int j =2 ; j<=n; j++){
                j = (int)Math.pow(j,j);
            }
        }
        // N Log N
    }
}
