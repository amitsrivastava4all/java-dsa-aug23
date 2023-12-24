package STRING_JAVA;

public class ReverseWords {

    static String reverse(String str){
        String[] words = str.split("\\s+");
        StringBuilder revStr = new StringBuilder();
        for(int i = words.length-1;i>=0;i--){
            revStr.append(words[i]);
            revStr.append(" ");
        }

        return revStr.toString();

    }
    public static void main(String[] args) {
        System.out.println(reverse("The Sky Is Blue"));
    }
}
