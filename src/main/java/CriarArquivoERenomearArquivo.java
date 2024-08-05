import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.io.IOException;

public class CriarArquivoERenomearArquivo {
    public static void main(String[] args) {
        criarPasta("DiretorioCriado");
        criarArquivo("bloco.txt");
        renomearArquivo("bloco.txt", "newBloco.txt");
    }

    public static void criarPasta(String diretorio){
        StringBuilder diretorioString = new StringBuilder("C:\\Users\\Etaniel\\Desktop\\Desenvolvimento\\exerciciojava\\src\\Files\\");
        StringBuilder appendString = diretorioString.append(diretorio);

        File file = new File(String.valueOf(appendString));
        boolean mkdirPasta = file.mkdir();
        if (mkdirPasta){
            System.out.println("Pasta criada.");
        }else {
            System.out.println("Pasta não criada.");
        }
    }
    public static void criarArquivo(String nameArchive){
        StringBuilder stringBuilderArchive = new StringBuilder("C:\\Users\\Etaniel\\Desktop\\Desenvolvimento\\exerciciojava\\src\\Files\\");
        StringBuilder appendNameArchive = stringBuilderArchive.append(nameArchive);

        File fileArchive = new File(String.valueOf(appendNameArchive));
        try {
            boolean newFile = fileArchive.createNewFile();
            if (newFile){
                System.out.println("Arquivo Criado.");
            } else {
                System.out.println("Arquivo não criado.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void renomearArquivo(String oldName ,String newName){
        String basePath = "C:\\Users\\Etaniel\\Desktop\\Desenvolvimento\\exerciciojava\\src\\Files\\";
        File oldFile = new File(basePath + oldName);
        File newFile = new File(basePath + newName);

        boolean renameTo = oldFile.renameTo(newFile);
        if (renameTo){
            System.out.println(oldName + " arquivo renomeado para " + newName);
        } else {
            System.out.println("Arquivo não renomeado");
        }


    }
}
