public class Longest1sString {
    static int getLongestLengthofSubString(String str){
        int left = 0;
        
        int maxLength = 0;
        int countZeros  = 0;
        for(int right = 0; right<str.length(); right++){
            if(str.charAt(right)=='0'){
                countZeros++;
            }
            while(countZeros>1){
                if(str.charAt(left)=='0'){
                    countZeros--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);    
        }
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(getLongestLengthofSubString("11001101"));
    }
}
