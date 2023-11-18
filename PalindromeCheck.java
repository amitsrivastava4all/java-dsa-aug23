class PalindromeCheck{

    static boolean isPalindromeString(String str){
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "abcd";
        String result = isPalindromeString(str)?"Palindrome String ":"Not Palindrome String";
        System.out.println(result);
    }
}