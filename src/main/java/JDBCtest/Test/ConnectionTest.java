package JDBCtest.Test;

import JDBCtest.Connection.ConnectionFactory;
import JDBCtest.Dominio.TestNames;
import JDBCtest.Repository.NameTestRepository;

public class ConnectionTest {
    public static void main(String[] args) {
        TestNames joaoCarlos = TestNames.TestNamesBuilder.builder()
                .withName("Pedro Vinicius").build();

        NameTestRepository.save(joaoCarlos);
    }
}
