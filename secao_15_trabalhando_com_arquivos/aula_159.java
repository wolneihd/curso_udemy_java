import java.util.Scanner;
import java.io.File;

public class aula_159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o caminho do arquivo: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("PASTAS: ");
        for (File pasta: folders) {
            System.out.println(pasta);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("ARQUIVOS");
        for (File arquivo: files) {
            System.out.println(arquivo);
        }

        // gera pasta automaticamente:
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Diretório criado com sucesso: " + success);

        sc.close();
    }
}
