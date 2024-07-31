public class RTTT16
{
        public static int Start(int n)
        {
            for(int i=0;i<=n;i++){
                for(int j=n-1;j>i;j--)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            return n;
        }
        public static void main(String[] args)
        {
            Start(10);
        }
}
