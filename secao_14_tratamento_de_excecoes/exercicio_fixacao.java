import java.util.Scanner;

import model.entities.Account;
import model.exceptions.AccountException;

public class exercicio_fixacao {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("\nN° da conta: ");
            int numero = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome do portador da conta: ");
            String nome = sc.nextLine();
            System.out.print("Saldo inicial: ");
            Double saldoInicial = sc.nextDouble();
            sc.nextLine();
            System.out.print("Limite por saque: ");
            Double limiteSaque = sc.nextDouble();

            Account conta = new Account(numero, nome, saldoInicial, limiteSaque);

            // ENTRE ABAIXO COM O SAQUE DESEJADO:
            conta.withdraw(250.00);

            System.out.println(conta.toString());

        } catch (AccountException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Erro inesperado!");
        }

        sc.close();
    }
}
