import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class limbda {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        System.out.println("Original list: " + numbers);
        Collections.sort(numbers, (Integer a, Integer b) -> a.compareTo(b));
        System.out.println("Sorted list: " + numbers);
    }
}
