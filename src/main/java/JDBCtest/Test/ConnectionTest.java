package JDBCtest.Test;

import JDBCtest.Dominio.TestNames;
import JDBCtest.Repository.NameTestRepository;
import JDBCtest.services.TestNamesService;

public class ConnectionTest {
    public static void main(String[] args) {
        TestNames joaoCarlos = TestNames.builder().name("Pedrão").build();
//        TestNamesService.addToTable(joaoCarlos);
//        TestNamesService.deleteInBetweenIds(2,5);
        TestNamesService.deleteSingleId(6);
    }
}
