package JDBCtest.Test;

import JDBCtest.Dominio.TestNames;
import JDBCtest.Repository.NameTestRepository;
import JDBCtest.services.TestNamesService;
import com.mysql.cj.log.Log;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionTest {
    public static void main(String[] args) {
        TestNames joaoCarlos = TestNames.builder().name("Pedrão").build();
        TestNames updateName = TestNames.builder().id(1).name("Pedrão").build();

//        TestNamesService.addToTable(joaoCarlos);
//        TestNamesService.deleteInBetweenIds(2,5);
//        TestNamesService.deleteSingleId(6);
//        TestNamesService.updateTestName(updateName);
        List<TestNames> all = TestNamesService.findAll();
        log.info("Found Itens in the database: {}", all);
    }
}
