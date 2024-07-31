import com.mysql.cj.xdevapi.Table;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class TABLELIST {
    public static void main(String[] args) {
        final String url = "jdbc:mysql://localhost:3306";
        final String username = "root";
        final String password = "root";
        try {
            Connection con = connection(url, username, password);
            System.out.println(" \n DATABASE CONNECTED ..... \n ");
            Scanner scanner= new Scanner(System.in);
            System.out.println(" Enter the Database Name = ");
            String str=scanner.next();
            DatabaseMetaData data=con.getMetaData();
            ResultSet resultSet=data.getTables(null,str,null,null);
            while (resultSet.next()){
                String table=resultSet.getString("Table");
                System.out.println(table);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static Connection connection(String url,String username,String password)throws Exception {
        return DriverManager.getConnection(url, username, password);
    }
}
