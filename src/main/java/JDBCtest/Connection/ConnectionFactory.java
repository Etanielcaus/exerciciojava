package JDBCtest.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3308/table_test";
        String user = "root";
        String password = "root";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
