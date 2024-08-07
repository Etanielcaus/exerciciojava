package JDBCtest.Repository;

import JDBCtest.Connection.ConnectionFactory;
import JDBCtest.Dominio.TestNames;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class NameTestRepository {
    public static void save(TestNames testNames) {
        String sql = "INSERT INTO `table_test`.`test_names` (`name`) VALUES ('%s');".formatted(testNames.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int itemAdded = stmt.executeUpdate(sql);
            log.info("An item added in the database - '{}', the item added is {}", itemAdded, sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
