import java.sql.*;

public class showdatabse {
    static void Showschema(Connection con) {
        String show="SHOW DATABASES";
        try {
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(show);
            System.out.println("List of databases:");
            while (result.next()) {
                String databaseName = result.getString("Database");
                System.out.println(databaseName);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){
        Connection con =null;
        con = Create();
        Showschema(con);
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
