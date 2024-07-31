//find the String in java
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class RRTT21 {
     boolean stringInFile(String filepath, String str)throws FileNotFoundException {
        File file = new File(filepath);

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.contains(str)) {
                scanner.close();
                return true;
            }
        }
        scanner.close();
        return false;
    }

    public static void main(String[] args)throws FileNotFoundException {
         RRTT21 obj1=new RRTT21();
         System.out.println(obj1.stringInFile("example.txt","ranjith"));
         System.out.println(obj1.stringInFile("stringtask21.txt","kumar"));
    }
}
