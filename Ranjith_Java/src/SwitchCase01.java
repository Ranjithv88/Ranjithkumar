import java.util.Scanner;

public class SwitchCase01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Value = ");
        String str= scanner.next();
        int number = Integer.parseInt(str);
        switch (number) {
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tus");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("tues");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
            case 7:
                System.out.println("sun");
                break;
        }
    }
}
