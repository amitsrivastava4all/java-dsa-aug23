package HashMap;

import java.util.HashMap;
import java.util.Map;

public class AreAnagram {

    static boolean areAnag(String str1 , String str2){

        Map<Character , Integer> hashMap_str1 = new HashMap<>();
        Map<Character , Integer> hashMap_str2 = new HashMap<>();

        // Character Frequency of string 1 to be stored in hashmap1
        for(char singleChar : str1.toCharArray()){
            hashMap_str1.put(singleChar , hashMap_str1.getOrDefault(singleChar, 0) + 1);
        }

        // Character Frequency of string 2 to be stored in hashmap2
        for(char singleChar : str2.toCharArray()){
            hashMap_str2.put(singleChar , hashMap_str2.getOrDefault(singleChar, 0) + 1);
        }

        // compare hashmap1 and hashmap2
        return hashMap_str1.equals(hashMap_str2);
    }
    public static void main(String[] args) {
        System.out.println(areAnag("silent", "listen"));
    }
}
