//print a date in specific format in java
import java.text.SimpleDateFormat;
import java.util.Date;
public class R23 {
    public static void main (String args[]){
        String pattern="MM-dd-YYYY";
        SimpleDateFormat s=new SimpleDateFormat(pattern);
        String date=s.format(new Date());
        System.out.println(date);
    }
}
