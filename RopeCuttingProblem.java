public class RopeCuttingProblem {
    static int maxPieces(int ropeLen, int option1, int option2, int option3){
        // Termination Case
        if(ropeLen==0){
            return 0;
        }
        if(ropeLen<0){
            return -1;
        }
       
        int r1 = maxPieces(ropeLen-option1, option1, option2, option3);
        int r2 = maxPieces(ropeLen-option2, option1, option2, option3);
        int r3 = maxPieces(ropeLen-option3, option1, option2, option3);
        int finalResult = Math.max(r1, Math.max(r2, r3));
        if(finalResult==-1){
            return -1;
        }
        return finalResult + 1;
    }
    public static void main(String[] args) {
        System.out.println(maxPieces(23, 12, 11, 9));
    }
}
