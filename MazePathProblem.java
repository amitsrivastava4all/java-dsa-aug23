import java.util.ArrayList;
public class MazePathProblem {

    static ArrayList<String> getMazePaths (int currentRow, int currentCol, int endRow, int endCol){
        // react to 2,2
        if(currentRow==endRow && currentCol== endCol){

        }
        // Cross the 2,2 either Horizontal or Vertically

    }
    public static void main(String[] args) {
        ArrayList<String> result = getMazePaths(0, 0, 2, 2);
        System.out.println(result);
    }
}
