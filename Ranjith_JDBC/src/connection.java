import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
    public static void main(String[] args){
        Connection con =null;
        con = Create();
    }
    static Connection Create(){
        final String url = "jdbc:mysql://localhost:3306";
        final String username= "root";
        final String password = "root";
        Connection con = null;
        try{
            con= connection(url,username,password);
            System.out.println(" \n DATABASE CONNECTED ..... \n ");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return con;
    }

    public static Connection connection(String url,String username,String password)throws Exception {
        return DriverManager.getConnection(url, username, password);
    }
}
