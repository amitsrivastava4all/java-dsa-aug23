package HashMap;

import java.util.HashMap;
import java.util.Map;

public class IntroToHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer , String>();
        map.put(1, "One");
        map.put(2, "Two");

        String value = map.get(1);
        System.out.println(value);
        String value2 = map.get(2);
        System.out.println(value2);
    }

}
