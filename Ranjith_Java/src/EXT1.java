//Reverse The String value
import java.util.Scanner;
public class EXT1 {
    public static void main(String[] args){
    Scanner n=new Scanner(System.in);
        System.out.print("Enter The String = ");
        String str=n.nextLine();
    System.out.println(" The Orignal String is "+str+" Reverse String is 1"+reverse(str));
    }
    public static String reverse(String in){
        if(in==null)
            throw new IllegalArgumentException("null not vaild input");
        StringBuilder out=new StringBuilder();
        char[] chars=in.toCharArray();
        for(int i=chars.length-1;i>=0;i--)
            out.append(chars[i]);
        return out.toString();
    }
}
