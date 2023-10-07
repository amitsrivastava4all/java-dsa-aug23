import java.util.ArrayList;
class BoardDice{

    static ArrayList<String> reachToTen(int start, int end){
        if(start == end){
            // reach to 10, stop here
            // Create a Blank Array List
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        if(start>end){
            // this case cross end
            ArrayList<String> list = new ArrayList<>();
            return list;
            // not part of the result, stop it.
        }
        ArrayList<String> finalResult = new ArrayList<>();
        for(int dice = 1; dice<=6; dice++){
            int newValue = start + dice;
            ArrayList<String> list = reachToTen(newValue, end);
            // this loop only runs when it reach to 10
            for(String str : list){
                finalResult.add(dice + str);
            }
        }
        return finalResult;
    }
    public static void main(String[] args) {
        ArrayList<String> result = reachToTen(0, 10);
        System.out.println(result);
    }
}