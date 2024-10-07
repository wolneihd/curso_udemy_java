import java.util.Scanner;
import java.util.InputMismatchException;

public class aula_145 {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        System.out.println("=== INICIO DO METODO 1 ===");
        method2();
        System.out.println("=== INICIO DO METODO 1 ===");
    }

    public static void method2() {
        System.out.println("=== INICIO DO METODO 2 ===");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vetor = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vetor[position]);            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida!");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Tipo de entrada inválido");
        }

        System.out.println("Fim do programa!");

        sc.close();
        System.out.println("=== FIM DO METODO 2 ===");
    } 
}
