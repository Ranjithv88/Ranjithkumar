import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DELETE {
    public static void main(String[] args){
        var01 obj=new var01();
        try{
            obj.con = connection(obj.url, obj.username, obj.password);
            System.out.println("connection Established successfully");
            dele(obj.con);
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
    static void dele(Connection con)
    {
        try{
//            String desql="DELETE FROM ranjith WHERE regno=1;";
            String desql="DELETE FROM ranjith WHERE regno=?;";
            PreparedStatement statement=con.prepareStatement(desql);
            statement.setInt(1,1);
//            statement.executeUpdate();
            boolean rows = statement.execute();
            System.out.println("Rows affected: " + rows);
        }catch (SQLException e){
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
