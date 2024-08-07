package JDBCtest.services;

import JDBCtest.Dominio.TestNames;
import JDBCtest.Repository.NameTestRepository;

public class TestNamesService {
    public static void addToTable(TestNames testNames){
        NameTestRepository.save(testNames);
    }
    public static void deleteInBetweenIds(int initialId, int finalId){
        NameTestRepository.deleteInBetween(initialId, finalId);
    }
    public static void deleteSingleId(int id){
        NameTestRepository.deleteWithSingleId(id);
    }


}
