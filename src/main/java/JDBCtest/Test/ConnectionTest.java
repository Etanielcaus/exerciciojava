package JDBCtest.Test;

import JDBCtest.Dominio.TestNames;
import JDBCtest.Repository.NameTestRepository;

public class ConnectionTest {
    public static void main(String[] args) {
        TestNames joaoCarlos = TestNames.builder().name("Pedrão").build();
        NameTestRepository.save(joaoCarlos);
    }
}
