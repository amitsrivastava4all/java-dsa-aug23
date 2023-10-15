public class Perm {
    static void printStringPerm(String s, String r){
        if(s.length()==0){
            System.out.println(r);
            return ; 
        }
        /*
         * Logic - pick each character from a string and call recursively
         */
        for(int i = 0; i<s.length(); i++){
            char singleChar = s.charAt(i); // a
            String remString = s.substring(0, i) + s.substring(i+1); //bc
            printStringPerm(remString, r+singleChar);

        }
    }
    public static void main(String[] args) {
        printStringPerm("abc", "");
    }
}
