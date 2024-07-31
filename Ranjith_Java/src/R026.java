import java.util.*;
public class R026 {
    public static void main(String[] args){
     String str1="abcdABCDabcd";
        System.out.println(str1);
     char[] Chars=str1.toCharArray();
     Map<Character,Integer> charsCount =new HashMap<>();
     for (char c:Chars){
         if(charsCount.containsKey(c)) {
             charsCount.put(c, charsCount.get(c) + 1);
         }else{
                    charsCount.put(c,1);
             }
         System.out.println(charsCount);
         }
    }
}
