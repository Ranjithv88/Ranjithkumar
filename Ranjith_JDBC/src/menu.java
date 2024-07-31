import java.sql.*;
import java.util.Scanner;

public class menu {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
        final String url = "jdbc:mysql://localhost:3306";
        final String username= "root";
        final String password = "root";
        Connection con = null;
        int num;
        String menu=" \n Database Menu \n{\n"+
                " 1.Get Connection in Database \n "+
                "2.Create new Database  \n "+
                "3.Create Table in the Database \n "+
                "4.Alter Table in Database \n "+
                "5.Insert the Table \n "+
                "6.Select table \n "+
                "7.Update table \n "+
                "8.Delete table \n "+
                "9.Drop the Table in the Database \n "+
                "10.Show the Database \n "+
                "11.Drop the Database \n "+
                "12.Close the Database Connection.....} \n\n "+
                "13.Exit Menu !";

        try{
            con= connection(url,username,password);
            System.out.println(menu);
            do {
                System.out.print("\nSelect the options = ");
                num = scanner.nextInt();
                switch (num) {
                    case 1:
                        con = Create();
                        break;
                    case 2:
                        schema(con);
                        break;
                    case 3:
                        createTable(con);
                        break;
                    case 4:
                        alter(con);
                        break;
                    case 5:
                        insert(con);
                        break;
                    case 6:
                        select(con);
                        break;
                    case 7:
                        update(con);
                        break;
                    case 8:
                        delete(con);
                        break;
                    case 9:
                        drop(con);
                        break;
                    case 10:
                        Showschema(con);
                        break;
                    case 11:
                        Dropdatabse(con);
                        break;
                    case 12:
                        CloseConnection(con);
                        break;
                    case 13:
                        System.out.println("Exit.......");
                        break;
                    default:
                        System.out.println(" \nChose correct number in tha list || Please try again ! ........ ");
                        break;
                }
            }while(num != 13);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(menu);
        }
    }

    public static Connection connection(String url,String username,String password)throws Exception {
        return DriverManager.getConnection(url, username, password);
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

    static void Showschema(Connection con) {
        String show="SHOW DATABASES";
        try {
            con = Create();
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

    static void schema(Connection con) {
        System.out.println("Enter the Database Name : ");
        String schemaName = scanner.next();
        String newschema = "CREATE DATABASE " +schemaName;
        try {
            PreparedStatement statement = con.prepareStatement(newschema);
            statement.executeUpdate();
            System.out.println("Schema created successfully: " +schemaName);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static void createTable(Connection con){
        System.out.println("Enter the Database Name : ");
        String DBname = scanner.next();
        System.out.println("Enter the Table Name : ");
        String tab = scanner.next();
        String use="use "+DBname+";";
        String create="CREATE TABLE "+tab+"("+"SNO INT PRIMARY KEY,"+"NAME VARCHAR(45),"+"AGE INT);";
        try{
            PreparedStatement statement= con.prepareStatement(use);
            statement.execute();

            PreparedStatement statement01 = con.prepareStatement(create);
            statement01.execute();

            System.out.println(tab+" = successfully table create ! ");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    static void alter(Connection con)throws SQLException
    {
        System.out.println("Enter the Table Name : ");
        String alter = scanner.next();
        String menu2="Alter Menu \n{\n"+ "1.Add Column\n"+"2.modify Column\n"+"3.drop column\n"+"4.Change column\n"+"5.Exit\n}";
        System.out.println(menu2+"\nSelect the options = ");
        int alter1 = scanner.nextInt();
        Statement statement=con.createStatement();
        try{
            do {
                switch (alter1) {
                    case 1:
                        String alteradd = "ALTER TABLE " + alter + " ADD COLUMN (email01 VARCHAR(100),RUN VARCHAR(30),SUM INT);";
                        statement.execute(alteradd);
                        System.out.println("add colums in table succefully! = ");
                        break;
                    case 2:
                        String altermodify = "ALTER TABLE " + alter + " MODIFY COLUMN RUN INT";
                        statement.execute(altermodify);
                        System.out.println("modify colums in table succefully! = ");
                        break;
                    case 3:
                        String alterdrop = "ALTER TABLE " + alter + " DROP COLUMN SUM";
                        statement.execute(alterdrop);
                        System.out.println("drop colums in table succefully! = ");
                        break;
                    case 4:
                        String alterchange = "ALTER TABLE " + alter + "CHANGE COLUMN NAME studname VARCHAR(50)";
                        statement.execute(alterchange);
                        System.out.println("change colums in table succefully! = ");
                    case 5:
                        System.out.println("Exit......");
                        break;
                    default:
                        System.out.println(" \nChose correct number in tha list || Please try again ! ........ ");
                        break;
                }
            }while (alter1 !=5);
        }catch (SQLException e){
            System.out.println(e.getMessage());
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
        String select="SELECT * FROM ranjith;";
        try {
            PreparedStatement statement= con.prepareStatement(select);
            ResultSet table =statement.executeQuery();
            printcolums(table);
            while (table.next()) {
                printRow(table);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
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
            System.out.println(e.getMessage());
        }
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
            System.out.println(e.getMessage());
        }
    }

    static void drop(Connection con) {
        try {
            String drop = "DROP TABLE ranjith05";
            PreparedStatement statement = con.prepareStatement(drop);
            statement.execute();
            System.out.println("Table 'ranjith05' dropped successfully ! ");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static void Dropdatabse(Connection con) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Database Name : ");
        String schemaName = scanner.next();
        String Dropschema = "DROP DATABASE " + schemaName;
        try {
            PreparedStatement statement=con.prepareStatement(Dropschema);
            statement.executeUpdate(Dropschema);
            System.out.println("Database Drop successfully: " +schemaName);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static void CloseConnection(Connection con){
        try{
            con.close();
            System.out.println(" \n Database connection closed! ...... \n ");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
