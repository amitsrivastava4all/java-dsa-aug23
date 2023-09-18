public class Pattern2 {
    static void printSpace(int numberOfSpace){
        if(numberOfSpace ==0){
            return;
        }
        System.out.print(" ");
        printSpace(numberOfSpace-1);
    }
    static void printStar(int numberOfStar){
        if(numberOfStar==0){
            return ;
        }
        System.out.print("*");
        printStar(numberOfStar-1);
    }
    static void printLine(int numberOfLines, int MAX_LINES){
        if(numberOfLines==0){
            return ;
        }
        // stack build    
        printLine(numberOfLines-1, MAX_LINES);
        // Stack fall
        printSpace(MAX_LINES - numberOfLines);
        printStar(numberOfLines);
        System.out.println(); // new line
           
    }
   public static void main(String[] args) {
        final int MAX_LINES = 5;
        printLine(MAX_LINES, MAX_LINES);
   } 
}
