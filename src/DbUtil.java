import java.sql.*;

public class DbUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/application";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    // Method to get a connection to the database
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    // Method to close resources
    public static void close(AutoCloseable... resources) {
        for (AutoCloseable resource : resources) {
            try {
                if (resource != null) {
                    resource.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}