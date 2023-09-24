import java.util.ArrayList;
public class SubSequenceOfAString {

    static ArrayList<String> getSubSequences(String str){
        // Termination Case
        if(str.length()==0){
           ArrayList<String> list = new ArrayList<>();
           list.add("");
           return list;
        }
        // pick the first char
        char firstChar = str.charAt(0);
        // make string small till string exhaust
        ArrayList<String> result = getSubSequences(str.substring(1));
        ArrayList<String> finalResult = new ArrayList<>();
        // Do Include and Do Not Include
        for(int i = 0; i<result.size(); i++){
            finalResult.add(result.get(i)); // Not Include
            finalResult.add(firstChar + result.get(i)); // Include
        }
        return finalResult;
    }

    public static void main(String[] args) {
        ArrayList<String> result = getSubSequences("amit");
        System.out.println(result);
    }
}
