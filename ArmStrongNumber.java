import java.util.Scanner;

public class ArmStrongNumber {
    static int countDigit(int num){
        if(num==0){
            return 0;
        }
        int count= countDigit(num/10);
        return ++count;
    }
    static int getArmStrong(int num, int count){
        if(num ==0){
            return 0;
        }
        int sum = getArmStrong(num/10, count);
        int digit = num % 10;
        return sum + (int)Math.pow(digit, count);
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        int num = new Scanner(System.in).nextInt();
        int count = countDigit(num);
        int result = getArmStrong(num, count);
        System.out.println(num == result ?"ArmStrong Number":"Not ArmStrong Number");
       // System.out.println(count);

    }
}
