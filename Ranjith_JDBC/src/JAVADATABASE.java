import java.sql.*;
import java.util.Scanner;

class VAR {
    final String schemaName = "ranjith07";
    final String url = "jdbc:mysql://localhost:3306/ranjith_jdbc";
    final String username= "root";
    final String password = "root";
    Connection con;
    }
public class JAVADATABASE {
    static VAR obj=new VAR();
    public static void main(String[] args){
        try{
            obj.con= connection(obj.url,obj.username,obj.password);
            System.out.println("\nDATABASE CONNECTED!\n");
            schema(obj.con);
            create(obj.con);
            alter(obj.con);
            insert(obj.con);
            select(obj.con);
            update(obj.con);
            selecttable(obj.con);
            delete(obj.con);
            drop(obj.con);
            System.out.println("\nDATABASE CLOSED!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Connection connection(String url,String username,String password)throws Exception {
        return DriverManager.getConnection(url, username, password);
    }
    static void schema(Connection con) {
        String newschema = "CREATE DATABASE " + obj.schemaName;
        try {
            PreparedStatement statement = con.prepareStatement(newschema);
            statement.executeUpdate();
            System.out.println("Schema created successfully: " + obj.schemaName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    static void create(Connection con){
        String create="CREATE TABLE ranjith07("+"SNO INT(10) PRIMARY KEY,"+"NAME VARCHAR(45),"+"AGE INT(10));";
        try{
            PreparedStatement statement= con.prepareStatement(create);
            boolean result=statement.execute();
            System.out.println(result);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    static void alter(Connection con)
    {
        try{
            String alteradd = "ALTER TABLE ranjith07 ADD COLUMN (email01 VARCHAR(100),RUN VARCHAR(30),SUM INT);";
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
    static void insert(Connection con)
    {
        try{
            String insql="INSERT INTO ranjith02(SNO,NAME,AGE) VALUES(?,?,?);";
            PreparedStatement statement=con.prepareStatement(insql);
            Scanner s=new Scanner(System.in);

            System.out.print("Enter The SNO =");
            int in =s.nextInt();
            statement.setInt(1, in);

            System.out.print("Enter The NAME = ");
            String str=s.next();
            statement.setString(2, str);

            System.out.print("Enter The AGE = ");
            int de=s.nextInt();
            statement.setInt(3, de);

            statement.execute();
            System.out.println("after record");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    static void select(Connection con){
        try{
            String select="SELECT * FROM ranjith;";
            PreparedStatement statement= con.prepareStatement(select);
            ResultSet table =statement.executeQuery();
            while (table.next()) {
                int regno = table.getInt("regno");
                String name = table.getString("name");
                String degree = table.getString("degree");

                System.out.print(" REGNO : "+regno);
                System.out.print(" NAME : "+name);
                System.out.println(" DEGEREE : "+degree);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    static void update(Connection con)
    {
        try{
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
    static void selecttable(Connection con){
        String select="SELECT * FROM ranjith;";
        try {
            PreparedStatement statement= con.prepareStatement(select);
            ResultSet table =statement.executeQuery();
            printcolums(table);
            while (table.next()) {
                printRow(table);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    static void printcolums(ResultSet table)throws SQLException{
        int colums= table.getMetaData().getColumnCount();
        for (int i = 1; i <= colums; i++) {
            System.out.print(table.getMetaData().getColumnName(i) + "\t\t ");
        }
        System.out.println();
    }
    static void printRow(ResultSet rs) throws SQLException {
        int columns = rs.getMetaData().getColumnCount();
        for (int i = 1; i <= columns; i++) {
            System.out.print(rs.getString(i) + "\t\t\t");
        }
        System.out.println();
    }
    static void delete(Connection con)
    {
        try{
            String desql="DELETE FROM ranjith02 WHERE SNO=?;";
            PreparedStatement statement=con.prepareStatement(desql);
            statement.setInt(1,1);
            boolean rows = statement.execute();
            System.out.println(rows);
        }catch (SQLException e){
            e.printStackTrace();
        }
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

