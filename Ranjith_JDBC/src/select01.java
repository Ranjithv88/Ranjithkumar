import java.sql.*;

public class select01 {
    public static void main(String[] args){
        var01 obj=new var01();
        try{
            obj.con= connection(obj.url,obj.username,obj.password);
            System.out.println("\nDATABASE CONNECTED!\n");
            select(obj.con);
            System.out.println("\nDATABASE CLOSED!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Connection connection(String url,String username,String password)throws Exception {
        return DriverManager.getConnection(url, username, password);
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
}
