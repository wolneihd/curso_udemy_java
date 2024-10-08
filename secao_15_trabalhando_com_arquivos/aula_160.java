import java.io.File;

public class aula_160 {
    public static void main(String[] args) {

        String strPath = "C:\\Users\\f0fp0228\\Desktop\\Curso DEV\\curso_udemy_java\\readme.md";

        File path = new File(strPath);

        System.out.println("getPath:" + path.getName());
        System.out.println("getParent:" + path.getParent());
        System.out.println("getName:" + path.getPath());
    }
}
