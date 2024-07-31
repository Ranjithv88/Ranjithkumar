import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class createtable {
    public static  void main(String[] args){
        VAR obj= new VAR();
        try{
            obj.con= connection(obj.url,obj.username,obj.password);
            System.out.println("\nDATABASE CONNECTED!\n");
            create(obj.con);
            System.out.println("\nDATABASE CLOSED!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Connection connection(String url, String username, String password)throws Exception {
        return DriverManager.getConnection(url, username, password);
    }
    static void create(Connection con){
        String create="CREATE TABLE ranjith03("+"SNO INT(10) PRIMARY KEY,"+"NAME VARCHAR(45),"+"AGE INT(10));";
        try{
            PreparedStatement statement= con.prepareStatement(create);
            boolean result=statement.execute();
            System.out.println(result);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
