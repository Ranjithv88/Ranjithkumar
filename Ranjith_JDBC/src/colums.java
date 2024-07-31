//import java.sql.*;
//import java.util.Scanner;
//
//public class colums {
//    static Scanner scanner=new Scanner(System.in);
//    static String tab;
//    public static void main(String[] args){
//        final String url = "jdbc:mysql://localhost:3306";
//        final String username= "root";
//        final String password = "root";
//        Connection con = null;
//        try{
//            con= connection(url,username,password);
//            System.out.println(" \n DATABASE CONNECTED ..... \n ");
//            createTable(con);
////            add01(con);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public static Connection connection(String url,String username,String password)throws Exception {
//        return DriverManager.getConnection(url, username, password);
//    }
//
//    static void createTable(Connection con){
//
//        System.out.println("Enter the Database Name : ");
//        String DBname = scanner.next();
//
//        System.out.println("Enter the Table Name : ");
//        tab = scanner.next();
//        String use="use "+DBname+";";
//        String create="CREATE TABLE "+tab+"("+add01(con)+")";
//        try{
//            PreparedStatement statement= con.prepareStatement(use);
//            statement.execute();
//
//            PreparedStatement statement01 = con.prepareStatement(create);
//            statement01.execute();
//        }catch (SQLException e){
//            System.out.println(e.getMessage());
//        }
//    }
//    static String add01(connection con){
//        System.out.println("Enter The Column Numbers = ");
//        int i=scanner.nextInt();
//        for (int j=0;j<=i;j++) {
//            System.out.println("Enter the columname Name = :");
//            String tab1 = scanner.next();
//            System.out.println("Enter the Datatype Name = :");
//            String tab2 = scanner.next();
//            String alteradd = "ALTER TABLE " + tab + " ADD COLUMN ("+tab1+" "+tab2+");";
//            try {
//                PreparedStatement statement= con.prepareStatement(alteradd);
//                statement.execute();
//                System.out.println("create colums");
//            } catch (SQLException e) {
//                System.out.println(e.getMessage());
//            }
//        }return
//    }
//}
