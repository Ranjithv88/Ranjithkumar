import java.io.FileNotFoundException;

public class RT16 {
    public static void main(String[] args){
        System.out.println("Before exception");
        String str= null;
        try{
//            int length  = str.length();
//            int[] ary= new int[3];
//            ary[7]=12;
            throw new MyCustomException();
//            test();
        }
        catch (MyCustomException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This is finally block.");
        }

        System.out.println("After exception");
    }


    static void test()throws MyCustomException{
        throw new MyCustomException();
    }
}


class MyCustomException extends Exception{
    public MyCustomException(String message){
        super(message);
    }
    public MyCustomException(){}
}
