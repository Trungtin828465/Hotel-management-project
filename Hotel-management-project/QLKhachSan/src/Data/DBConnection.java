package Data;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://TRUNGTIN\\SQLEXPRESS:1433;databaseName=LINK;encrypt=false";
            String userName = "sa";
    		String password = "123456";
            connection = DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
