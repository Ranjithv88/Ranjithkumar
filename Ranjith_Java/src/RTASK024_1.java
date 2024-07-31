import java.util.HashMap;
import java.util.Map;
public class RTASK024_1 {
        public static void main(String[] args) {
            Map<String, Integer> score = new HashMap<>();

            score.put("david",200);
            score.put("ranjith",400);
            score.put("kumar",100);
            score.put("selva",300);

            System.out.println(score);
            R25 obj=new R25();
            score=obj.sortByValue(score);
            System.out.println(score);
        }
}
