import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OneLine {
    public static void main(String[] args) {
        List<Integer> list 
        = Arrays.
        asList(
            10,1,5,20,2,90,8,7);
            //list.sort(null);
         list.sort((a,b)->b-a);
         System.out.println(list);

    }
}
