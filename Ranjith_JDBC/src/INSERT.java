import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;

public class INSERT
{
    public static void main(String[] args)
    {
        String url = "jdbc:mysql://localhost:3306/ranjith_jdbc";
        String username = "root";
        String password = "root";

        try{
            Connection con = connection(url,username,password);
            System.out.println("connection Established successfully");
            insert(con);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("connection closed");
        }
    }
    static Connection connection(String url,String username,String password)throws Exception
    {
        return DriverManager.getConnection(url,username,password);
    }
    static void insert(Connection con)
    {
        try{
            String insql="INSERT INTO ranjith(regno,name,degree) VALUES(?,?,?);";
            PreparedStatement statement=con.prepareStatement(insql);
            Scanner s=new Scanner(System.in);

            System.out.print("Enter The regno =");
            int in =s.nextInt();
            statement.setInt(1, in);

            System.out.print("Enter The Name = ");
            String str=s.next();
            statement.setString(2, str);

            System.out.print("Enter The degree = ");
            String de=s.nextLine();
            statement.setString(3, de);
            statement.execute();
            System.out.println("after record");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
