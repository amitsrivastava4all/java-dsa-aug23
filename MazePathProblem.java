import java.util.ArrayList;
public class MazePathProblem {

    static ArrayList<String> getMazePaths (int currentRow, int currentCol, int endRow, int endCol){
        // react to 2,2
        if(currentRow==endRow && currentCol== endCol){
            ArrayList<String> r = new ArrayList<>();
            r.add("");
            return r;
        }
        ArrayList<String> finalList = new ArrayList<>();
        // Cross the 2,2 either Horizontal or Vertically
        if(currentCol>endCol || currentRow>endRow  ){
            ArrayList<String> r = new ArrayList<>();
            return r;
        }
        // Go first Horizontal
        ArrayList<String> horzList = getMazePaths(currentRow, currentCol+1, endRow, endCol);
        for(String str : horzList){
            finalList.add("H" + str);
        }
        // BackTrack time go vertical
        // Go Vertical
        ArrayList<String> vertList = getMazePaths(currentRow+1, currentCol, endRow, endCol);
        for(String str : vertList){
            finalList.add("V" + str);
        }
        // Diagonal
        ArrayList<String> digList = getMazePaths(currentRow+1, currentCol+1, endRow, endCol);
        for(String str : digList){
            finalList.add("D" + str);
        }
        return finalList;
    }
    public static void main(String[] args) {
        ArrayList<String> result = getMazePaths(0, 0, 2, 2);
        System.out.println(result);
    }
}
