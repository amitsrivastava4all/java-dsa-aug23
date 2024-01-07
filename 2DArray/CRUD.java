class TwoDArray{
    private  static int[][] matrix;
    private static int rows;
    private static int columns;

    public TwoDArray(int row ,int col){
        this.rows = row;
        this.columns = col;
        matrix = new int[row][col];
    }

    static void display (){
        for (int i=0; i<rows; ++i){
            for (int j=0; j<columns; ++j){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("=====================================");
    }

    static boolean isValidIndex(int row, int col){
        return ((row >= 0) && (row < rows) && (col >= 0 && col < columns));
    }

    static void update(int row,int col,int newValue){
        if(isValidIndex(row, col)){
            matrix[row][col] = newValue;
        }
        else{
            System.out.println("Invalid Index");
        }
    }
    static void delete(int row,int col){
        if(isValidIndex(row, col)){
            matrix[row][col] = 0;
        }
        else{
            System.out.println("Invalid Index");
        }
    }
}

public class CRUD {
    public static void main(String[] args) {
        TwoDArray array =new TwoDArray(2, 2);
        array.display();
        array.update(1, 1, 8);
        array.display();
        array.update(1, 3, 5);
        array.display();
    }
}
