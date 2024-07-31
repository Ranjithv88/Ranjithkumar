import java.util.ArrayList;
import java.util.List;

public class SCLONE {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<Integer>(List.of(1,2,3,4,5,6));
        List<Integer> list1=new ArrayList<Integer>();
        System.out.println(list);
        list.set(0,44);
        System.out.println(list);
    }
}
