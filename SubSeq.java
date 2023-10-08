public class SubSeq {

    static void getSubSeq(String str, String result){
        if(str.length()==0){
            System.out.print(result+" , ");
            return;
        }
        char singleChar = str.charAt(0);
        String smallString = str.substring(1);
        getSubSeq(smallString, result); // Not Include
        getSubSeq(smallString, result + singleChar);
        // Include
    }
    public static void main(String[] args) {
        getSubSeq("abc", "");
    }
}
