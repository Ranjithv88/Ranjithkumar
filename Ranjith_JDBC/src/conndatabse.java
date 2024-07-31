import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class conndatabse {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            final String url = "jdbc:mysql://localhost:3306/ranjith_jdbc";
            final String username= "root";
            final String password = "root";
            System.out.println("DATABASE CONNECTED");
            Connection con=connection(url,username,password);
            insert(con);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static Connection connection(String url,String username,String password)throws Exception{
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
            String de=s.next();
            statement.setString(3, de);
            statement.execute();
            System.out.println("after record");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
