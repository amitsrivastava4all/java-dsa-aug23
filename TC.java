import java.util.Scanner;

public class TC {

    static void show(int x){
        if(x<=0){
            return;
        }
        System.out.println(x);
        show(x-1);
        show(x-2);
    }

   public static void main(String[] args) {
    int n = 10;
    show(n);
    // System.out.println("Enter the Range");
    // int n = new Scanner(System.in).nextInt();
    // for(int i = 1; i<=n; i++){
    //     for(int j = 1; j<n; j++){

    //     }
    // }
    // // for(int i = 1; i<=10; i++){
    // //     System.out.println(i);
    // // }
    // for(int i = 1; i<=n; i++){
    //     System.out.println(i);
    // }
    // int x = 10;
    // int y = 20;
    // int z = x + y;
    // System.out.println(z);
   } 
}
