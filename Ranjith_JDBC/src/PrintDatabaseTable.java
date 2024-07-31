import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrintDatabaseTable {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ranjith_jdbc";
        String user = "root";
        String password = "root";

        String query = "SELECT * FROM ranjith;";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            int columnCount = rs.getMetaData().getColumnCount();
            String[] columnNames = new String[columnCount];
            for (int i = 0; i < columnCount; i++) {
                columnNames[i] = rs.getMetaData().getColumnName(i + 1);
            }
            printRow(columnNames);
            while (rs.next()) {
                String[] rowData = new String[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    rowData[i] = rs.getString(i + 1);
                }
                printRow(rowData);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static void printRow(String[] rowData) {
        // Assuming fixed width for columns for simplicity
        int columnWidth = 20;
        StringBuilder sb = new StringBuilder();
        for (String data : rowData) {
            sb.append(String.format("%-" + columnWidth + "s", data));
        }
        System.out.println(sb.toString());
    }
}
