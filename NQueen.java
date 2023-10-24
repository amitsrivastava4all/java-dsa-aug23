class NQueen{
   
   static int getNumberOfPossiblity(boolean board[][], int currentRow){
      int count = 0;
      // Termination Case
      if(currentRow == board.length){
         return 1;
      }

      // Traverse Each cell of a Current Row
      for(int col = 0; col<board[currentRow].length; col++){
         // Place a Queen on a Current Cell , But check before
         if(isSafeToPlaceAQueen(board,  currentRow, col)){
             board[currentRow][col] = true;  // Place a Queen
             int result = getNumberOfPossiblity(board, currentRow+1); 
             count = count + result;
             // BackTracking
             board[currentRow][col] = false; // Undo a Queen

         }  
      }
      return count;
   } 
   private static boolean isSafeToPlaceAQueen(boolean[][] board, int currentRow, int col) {
      // check on above row
      for(int i = currentRow; i>=0; i--){
         if(board[i][col]){
            return false;
         }
      }
      // check left upper diagonal
      for(int i = currentRow, j = col; i>=0 && j>=0 ; i--, j--){
         if(board[i][j]){
            return false;
         }
      }
      // check right upper diagonal
      for(int i = currentRow, j = col ; i>=0 && j<board.length; i--,j++){
         if(board[i][j]){
            return false;
         }
      }
      return true;
   }
   public static void main(String[] args) {
      final int N  = 9;
      boolean board[] [] = new boolean[N][N];
      System.out.println("Queen Place "+getNumberOfPossiblity(board, 0));
   } 
}