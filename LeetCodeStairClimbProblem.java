class LeetCodeStairClimbProblem {
    static public int climbStairs(int n) {
        return cs(0,n);
    }
    static public int cs(int i, int n){
        if(i==n){
            return 1;
        }
        if(i>n){
            return 0;
        }
        int firstStep = cs(i+1,n);
        int secondStep = cs(i+2,n);
        return firstStep + secondStep;
    }
    public static void main(String[] args) {
        int r = climbStairs(44);
        System.out.println(r);

    }
}
