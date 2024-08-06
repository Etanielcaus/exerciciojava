package JDBCtest.Repository;

import JDBCtest.Connection.ConnectionFactory;
import JDBCtest.Dominio.TestNames;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class NameTestRepository {
    public static void save(TestNames testNames){
        String sql = "INSERT INTO `table_test`.`test_names` (`name`) VALUES ('%s');".formatted(testNames.getName());
        try (Connection conn = ConnectionFactory.getConnection();
        Statement stmt = conn.createStatement()){
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
