import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class tabledrop {
    public static void main(String[] args) {
        var01 obj = new var01();
        try {
            obj.con = connection(obj.url, obj.username, obj.password);
            System.out.println("\nDATABASE CONNECTED!\n");
            drop(obj.con);
            System.out.println("\nDATABASE CLOSED!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static Connection connection(String url, String username, String password) throws Exception {
        return DriverManager.getConnection(url, username, password);
    }

    static void drop(Connection con) {
        try {
            String drop = "DROP TABLE ranjith03";
            PreparedStatement statement = con.prepareStatement(drop);
            boolean in =statement.execute();
            System.out.println("Table 'ranjith' dropped successfully! = "+in);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
