import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;

public class SCHEMA {
    public static void main(String[] args){
        var01 obj=new var01();
        String newschema = "CREATE DATABASE " + obj.schemaName;
        try {
            obj.con = DriverManager.getConnection(obj.url, obj.username, obj.password);
            PreparedStatement statement=obj.con.prepareStatement(newschema);
            statement.executeUpdate(newschema);
            System.out.println("Schema created successfully: " + obj.schemaName);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
