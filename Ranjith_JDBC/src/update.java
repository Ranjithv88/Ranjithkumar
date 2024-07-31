import java.sql.*;

public class update {
    public static void main(String[] args){
        var01 obj=new var01();
        try{
            obj.con= connection(obj.url,obj.username,obj.password);
            System.out.println("\nDATABASE CONNECTED!\n");
            update(obj.con);
            System.out.println("\nDATABASE CLOSED!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static Connection connection(String url, String username, String password)throws Exception
    {
        return DriverManager.getConnection(url,username,password);
    }
    static void update(Connection con)
    {
        try{
//            String update="UPDATE ranjith SET degree = 'bsc' WHERE regno = 6 AND NAME = 'ranjith';";
//            PreparedStatement statement=con.prepareStatement(update);
//            statement.executeUpdate();
//            System.out.println("successfully update!");

            String update="UPDATE ranjith SET degree = ? WHERE regno = ? AND NAME = ?;";
            PreparedStatement statement=con.prepareStatement(update);
            statement.setString(1,"bsc");
            statement.setInt(2,6);
            statement.setString(3,"ranjith");
            statement.executeUpdate();
            System.out.println("successfully update!");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
