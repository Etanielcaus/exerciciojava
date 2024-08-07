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

    public static void deleteInBetween(int initialNumber, int finalNumber) {
        String sql = "DELETE FROM `table_test`.`test_names` WHERE id BETWEEN %d AND %d".formatted(initialNumber, finalNumber);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int i = stmt.executeUpdate(sql);
            log.info("itens are deleted from the database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteWithSingleId(int id) {
        String sql = "DELETE FROM `table_test`.`test_names` WHERE (`id` = '%s');".formatted(id);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
            log.info("id = {} deleted from database.", id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void updateName(TestNames testNames) {
        String sql = "UPDATE `table_test`.`test_names` SET `name` = '%s' WHERE (`id` = '%d');".formatted(testNames.getName(), testNames.getId());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
            log.info("id '{}' update, changed '{}'", testNames.getId(), testNames.getName());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
