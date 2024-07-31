import java.sql.*;
import java.lang.String;
public class selectqurey {
    public static void main(String[] args){
        VAR obj=new VAR();
        try{
            obj.con = connection(obj.url, obj.username, obj.password);
            System.out.println("connection Established successfully");
            select(obj.con);
//            printRow(obj.con);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("connection closed");
        }
    }
    static Connection connection(String url, String username, String password)throws Exception
    {
        return DriverManager.getConnection(url,username,password);
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
    private static void printRow(String[] rowData) {
        int columnWidth = 20;
        StringBuilder sb = new StringBuilder();
        for (String data : rowData) {
            sb.append(String.format("%-" + columnWidth + "s", data));
        }
        System.out.println(sb.toString());
    }
}
