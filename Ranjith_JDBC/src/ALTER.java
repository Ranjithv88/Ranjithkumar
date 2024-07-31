import java.sql.*;

public class ALTER {
    public static void main(String[] args){
        var01 obj=new var01();
        try{
            obj.con= connection(obj.url,obj.username,obj.password);
            System.out.println("\nDATABASE CONNECTED!\n");
            alter(obj.con);
            System.out.println("\nDATABASE CLOSED!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static Connection connection(String url, String username, String password)throws Exception
    {
        return DriverManager.getConnection(url,username,password);
    }
    static void alter(Connection con)
    {
        try{
            String alteradd = "ALTER TABLE ranjith02 ADD COLUMN (email01 VARCHAR(100),RUN VARCHAR(30),SUM INT);";
            String altermodify = "ALTER TABLE ranjith02 MODIFY COLUMN RUN INT";
            String alterdrop = "ALTER TABLE ranjith02 DROP COLUMN SUM";
            String alterchange = "ALTER TABLE ranjith02 CHANGE COLUMN NAME studname VARCHAR(50)";

            Statement statement=con.createStatement();

            boolean in = statement.execute(alteradd);
            boolean an = statement.execute(altermodify);
            boolean out = statement.execute(alterdrop);
            boolean bin = statement.execute(alterchange);

            System.out.println("add colums in table succefully! = "+ in);
            System.out.println("modify colums in table succefully! = "+ an);
            System.out.println("drop colums in table succefully! = "+ out);
            System.out.println("change colums in table succefully! = "+ bin);

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
