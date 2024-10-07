import java.util.Scanner;
import java.util.InputMismatchException;

public class aula_144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String[] vetor = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vetor[position]);            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida!");
        } catch (InputMismatchException e) {
            System.out.println("Tipo de entrada inválido");
        }

        System.out.println("Fim do programa!");

        sc.close();
    }
}
