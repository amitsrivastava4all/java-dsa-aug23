public class Diamond {
    static void printSpace(int numberofSpace){
        if(numberofSpace==0){
            return ;
        }
        System.out.print(" ");
        printSpace(numberofSpace-1);
    }
    static void printStar(int numberOfStar){
        // Termination Case
        if(numberOfStar ==0){
            return ;
        }
        System.out.print("* ");
        printStar(numberOfStar-1);
    }
    static void printLine(int rows, int currentRow){
        // Termination Case
        if(rows==0){
            return;
        }
        // print a new line
        printSpace(rows-1);
        printStar(currentRow- rows+1);
        System.out.println();
        printLine(rows-1, currentRow); // Recursion
        // printSpace(numberOfLines);
        // printStar(numberOfLines);
        // System.out.println();
    }
    public static void main(String[] args) {
       printLine(5, 5);
    }
}
