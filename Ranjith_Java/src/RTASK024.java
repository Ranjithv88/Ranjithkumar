import java.util.*;
import java.util.Map.Entry;
public class RTASK024 extends R25 {
    public static void main(String[] args) {
        Map<String, Integer> score = new HashMap<>();

        score.put("david",1);
        score.put("ranjith",2);
        score.put("kumar",3);
        score.put("selva",4);

        System.out.println(score);
        score=sortByValue(score);
        System.out.println(score);
    }
}