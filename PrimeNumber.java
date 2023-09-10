import java.util.Scanner;

class PrimeNumber{
    static boolean isPrimeNumber(int num, int div){
        if(num == div){
            return true;
        }
        int rem = num%div;
        if(rem ==0){
            return false;
        }
        return isPrimeNumber(num, div+1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the Prime Number");
        int num = new Scanner(System.in).nextInt();
        int div = 2;
        System.out.println(isPrimeNumber(num, div)
        ?"Prime Number ":"Not a Prime Number");
    }
}