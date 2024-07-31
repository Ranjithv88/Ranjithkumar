//merged two list
import java.util.ArrayList;
import java.util.List;
public class R24 {
    public static void main(String args[]){
        List<String> list1=new ArrayList<>();
        list1.add("19654,9");
        List<String> list2=new ArrayList<>();
        list2.add("2,5,7,8");
        List<String> merged=new ArrayList<>(list1);
        merged.addAll(list2);
        System.out.println(merged);
    }
}
