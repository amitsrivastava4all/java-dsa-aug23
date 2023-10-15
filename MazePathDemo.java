public class MazePathDemo {

    static void printMazePath(int currentRow, int currentCol, int endRow, int endCol, String result){
        if(currentRow== endRow && currentCol==endCol){
            System.out.println(result);
            return ;
        }
        if(currentRow>endRow || currentCol>endCol){
            return ;
        }    
        // 2 Branches
            // Go One Step Horz
            printMazePath(currentRow, currentCol+1, endRow,endCol,  result + "H");
            printMazePath(currentRow+1, currentCol, endRow,endCol,  result + "V");
    }
    public static void main(String[] args) {
        printMazePath(0, 0, 2, 2, "");
    }
}
