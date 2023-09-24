public class Palindrome {

    static boolean isPalindrome(String str, int startIndex, int endIndex){
        // Base Case
        if(startIndex>=endIndex){
            return true;
        }    
        return str.charAt(startIndex) == str.charAt(endIndex) 
        && isPalindrome(str, startIndex+1, endIndex-1);
    }
    public static void main(String[] args) {
        String a = "ramesh";
        boolean result = isPalindrome(a, 0, a.length()-1);
        System.out.println(result?"Palindrome String":"Not Palindrome String");
    }
}
