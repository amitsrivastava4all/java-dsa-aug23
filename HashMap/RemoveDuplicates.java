package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicates {

    static int[] removedElement(int arr[]){
        Map<Integer , Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int element : arr){
            if(!map.containsKey(element)){
                map.put(element, 1);
                list.add(element);
            }
        }

        int new_arr[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            new_arr[i] = list.get(i);
        }
        
        return new_arr;
    }
    public static void main(String[] args) {
        int arr[] ={5,1,2,6,3,2,4,1,2};
        int ans[] = removedElement(arr);
        for(int i: ans){
            System.out.print(i + "  ");
        }
    }
}
