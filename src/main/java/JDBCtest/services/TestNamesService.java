package JDBCtest.services;

import JDBCtest.Dominio.TestNames;
import JDBCtest.Repository.NameTestRepository;

import java.util.List;

public class TestNamesService {
    public static void addToTable(TestNames testNames){
        NameTestRepository.save(testNames);
    }
    public static void deleteInBetweenIds(int initialId, int finalId){
        int initialValue = requireId(initialId);
        int finalValue = requireId(finalId);
        NameTestRepository.deleteInBetween(initialValue, finalValue);
    }
    public static void deleteSingleId(int id){
        requireId(id);
        NameTestRepository.deleteWithSingleId(id);
    }
    public static void updateTestName(TestNames testNames){
        requireId(testNames.getId());
        NameTestRepository.updateName(testNames);
    }

    public static List<TestNames> findAll(){
        return NameTestRepository.findAll();
    }

    private static int requireId(Integer id){
        if (id == null && id <= 0){
            throw new IllegalArgumentException("Invalid Value.");
        }
        return id;
    }


}
