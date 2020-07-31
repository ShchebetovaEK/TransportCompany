package connections;
import java.sql.*;


public class MySQLConnection {
    private static final String URL = "jdbc:mysql://localhost/transport?serverTimezone=Europe/Moscow";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}