package HashMap;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {

    static Map<Character, Integer> countCharFreq(String str){
        Map<Character,Integer> map = new HashMap<>();

        for(char singleChar : str.toCharArray()){
            map.put(singleChar, map.getOrDefault(singleChar, 0) + 1);
        }

        return map;
        
    }
    public static void main(String[] args) {
        Map<Character, Integer> result = countCharFreq("BrainMentors");
        // Print char with its frequency
        for(Map.Entry<Character,Integer> single_entry : result.entrySet()){
            System.out.println(single_entry.getKey() + " : " + single_entry.getValue());
        }
    }
}
