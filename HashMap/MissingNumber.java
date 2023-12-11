package HashMap;

import java.util.HashMap;

public class MissingNumber {

    static int findNum(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int element : arr){
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        // Check if number is present or not in the array
        for(int i=1;i<=arr.length+1;i++){
            if(!map.containsKey(i) || map.get(i) == 0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}
