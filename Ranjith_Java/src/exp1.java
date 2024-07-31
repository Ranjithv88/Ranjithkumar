public class exp1 {
    public static void main(String[] args) {
        System.out.println("before exception");
        String str = null;
        try {
            // int n =str.length();
            throw new NullPointerException("this null value");

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("this is finally block");
        }
        System.out.println("after exception");
    }
}



