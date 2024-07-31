//sort hashMap by value
import java.util.*;
import java.util.Map.Entry;
public class R25 {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("david", 95);
        scores.put("ranjith", 60);
        scores.put("kumar", 76);
        scores.put("selva", 61);

        System.out.println(scores);
        scores = sortByValue(scores);
        System.out.println(scores);
    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> scores) {
        Map<String, Integer> sortByValue = new LinkedHashMap<>();

        Set<Entry<String,Integer>>entrySet=scores.entrySet();
        System.out.println(entrySet);

        List<Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
        System.out.println(entryList);

        entryList.sort((x, y) -> x.getValue().compareTo(y.getValue()));
        System.out.println(entryList);

        for (Entry<String, Integer> e : entryList)
            sortByValue.put(e.getKey(), e.getValue());

        return sortByValue;

    }
}
