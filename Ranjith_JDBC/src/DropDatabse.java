import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DropDatabse {
    public static void main(String[] args){
        var01 obj=new var01();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Database Name : ");
        String schemaName = scanner.next();
        String Dropschema = "DROP DATABASE " + schemaName;
        try {
            obj.con = DriverManager.getConnection(obj.url, obj.username, obj.password);
            PreparedStatement statement=obj.con.prepareStatement(Dropschema);
            statement.executeUpdate(Dropschema);
            System.out.println("Schema created successfully: " +schemaName);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
