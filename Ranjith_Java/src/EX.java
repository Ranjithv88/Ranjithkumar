public class EX {
    public static void main(String[] args)throws ArithmeticException{
//        MyCustomException obj2=new CustomException();
//        System.out.println(obj2.customException(c));
        try{
            throw new MyCustomException();
        }
        catch (MyCustomException e){
            System.out.println(e.getMessage());
        }
    }
//    public static void test(){
//        throw new MyCustomException();
//    }
//    public class MyCustomException extends Exception{
//        public MyCustomException(String message){
//            int a=5;
//            int b=0;
//            int c=a/b;
//            return ;
//        }
//    }
}
